package com.mobiusvision.qrcode.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.mobiusvision.qrcode.entity.*;
import com.mobiusvision.qrcode.mapper.BpOrderMapper;
import com.mobiusvision.qrcode.mapper.TobaccoMapper;
import com.mobiusvision.qrcode.mapper.ViCustmsgMapper;
import com.mobiusvision.qrcode.service.BpOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BpOrderServiceimpl implements BpOrderService {

    @Autowired
    BpOrderMapper bpOrderMapper;
    @Autowired
    ViCustmsgMapper viCustmsgMapper;
    @Autowired
    TobaccoMapper tobaccoMapper;

    public BpOrderServiceimpl() {
    }

    public Map selectBdOrder(String OB_BCIG_BARCODE, String OCI_CIG_BRAND) {
        Map map = new HashMap();
        BpOrderBarcode bp_order_barcode = this.bpOrderMapper.selectBP_ORDER_BARCODE(OB_BCIG_BARCODE);
        if (bp_order_barcode == null) {
            map.put("500", "32位码不存在");
            return map;
        } else {
            BpOrderInfo bp_order_info = this.bpOrderMapper.selectBP_ORDER_INFO(bp_order_barcode.getObUuid());
            map.put("bp_order_info", bp_order_info);
            BpDistLine bp_dist_line = this.bpOrderMapper.selectBP_DIST_LINE(bp_order_info.getOiDlUuid());
            map.put("bp_dist_line", bp_dist_line);
            QueryWrapper wrapper1;
            if (OCI_CIG_BRAND != null) {
                wrapper1 = new QueryWrapper();
                wrapper1.eq("bar_code", OCI_CIG_BRAND);
                Tobacco tobacco = (Tobacco)this.tobaccoMapper.selectOne(wrapper1);
                map.put("bar", this.tobaccoMapper.selectOne(wrapper1));
            } else {
                List<Map> list = this.bpOrderMapper.selectyanBP_ORDER_INFO(bp_order_info.getOiUuid());
                map.put("bar", list);
            }

            wrapper1 = new QueryWrapper();
            wrapper1.eq("LICENSE_CODE", bp_order_barcode.getObRetailerCode());
            List<ViCustmsg> viCustmsgs = this.viCustmsgMapper.selectList(wrapper1);
            if (viCustmsgs.size() == 0) {
                Map map1 = new HashMap();
                map1.put("licenseCode", bp_order_info.getOiRetailerCode());
                map1.put("custName", bp_order_info.getOiRetailerName());
                map.put("viCustmsgs", map1);
            } else {
                map.put("viCustmsgs", viCustmsgs);
            }

            return map;
        }
    }
}
