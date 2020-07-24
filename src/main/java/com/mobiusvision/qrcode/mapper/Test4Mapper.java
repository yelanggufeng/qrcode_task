package com.mobiusvision.qrcode.mapper;

import com.mobiusvision.qrcode.entity.TestBean;
import com.mobiusvision.qrcode.entity.mysql.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface Test4Mapper {

    @Select({"select * from BP_ORDER_CIG_INFO"})
    List<TestBean> test();

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
