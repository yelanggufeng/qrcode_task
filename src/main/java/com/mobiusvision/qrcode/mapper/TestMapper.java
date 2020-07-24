package com.mobiusvision.qrcode.mapper;

import com.mobiusvision.qrcode.entity.BpDistLine;
import com.mobiusvision.qrcode.entity.BpOrderBarcode;
import com.mobiusvision.qrcode.entity.BpOrderInfo;
import com.mobiusvision.qrcode.entity.TestBean;
import com.mobiusvision.qrcode.entity.mysql.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
@Repository
public interface TestMapper {

    @Select({"select * from BP_ORDER_CIG_INFO"})
    List<TestBean> test();

    @Select({"SELECT * FROM BP_ORDER_BARCODE WHERE OB_BCIG_BARCODE = #{OB_BCIG_BARCODE} "})
    BpOrderBarcode selectBP_ORDER_BARCODE(String var1);

    @Select({"select * from  bp_order_info where  oi_uuid = "})
    BpOrderInfo selectBP_ORDER_INFO(String var1);

    @Select({" select * FROM bp_dist_line WHERE  dl_uuid = #{dl_uuid}"})
    BpDistLine selectBP_DIST_LINE(String var1);

    @Select({"  select * from  bp_order_cig_info WHERE oci_uuid=#{oi_uuid}"})
    List<Map> selectyanBP_ORDER_INFO(String var1);

    @Select({"select * from BP_BATCH"})
    List<mysql_BP_BATCH> selectbp_batch();

    @Select({"select * from BP_DIST_LINE  ORDER BY DL_ID DESC"})
    List<mysql_BP_DIST_LINE> selectbp_dist_line();

    @Select({"select * from BP_ORDER_BARCODE   where OB_SORT_DATE < #{end} and  OB_SORT_DATE >#{binge} ORDER BY  OB_SORT_DATE DESC"})
    List<mysql_BP_ORDER_BARCODE> selectbp_order_barcode(@Param("binge") String var1, @Param("end") String var2);

    @Select({"select * from BP_ORDER_CIG_INFO  ORDER BY  OCI_ID DESC "})
    List<mysql_BP_ORDER_CIG_INFO> selectbp_order_cig_info();

    @Select({"select * from BP_ORDER_INFO ORDER BY  OI_ID DESC  "})
    List<mysql_BP_ORDER_INFO> selectbp_order_info();
}
