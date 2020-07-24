package com.mobiusvision.qrcode.mapper;

import com.mobiusvision.qrcode.entity.BpDistLine;
import com.mobiusvision.qrcode.entity.BpOrderBarcode;
import com.mobiusvision.qrcode.entity.BpOrderInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BpOrderMapper {
    @Select({"SELECT * FROM BP_ORDER_BARCODE WHERE OB_BCIG_BARCODE = #{OB_BCIG_BARCODE} "})
    BpOrderBarcode selectBP_ORDER_BARCODE(String var1);

    @Select({"select * from  bp_order_info where  oi_uuid = #{oi_uuid}"})
    BpOrderInfo selectBP_ORDER_INFO(String var1);

    @Select({" select * FROM bp_dist_line WHERE  dl_uuid = #{dl_uuid}"})
    BpDistLine selectBP_DIST_LINE(String var1);

    @Select({"  select * from  bp_order_cig_info WHERE oci_uuid=#{oi_uuid}"})
    List<Map> selectyanBP_ORDER_INFO(String var1);
}
