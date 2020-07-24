package com.mobiusvision.qrcode.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bp_order_barcode")
public class BpOrderBarcode implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("OB_ID")
    private Long obId;

    /**
     * 订单唯一标识
     */
    @TableField("OB_UUID")
    private String obUuid;

    /**
     * 条码顺序号
     */
    @TableField("OB_SEQUENCE")
    private Integer obSequence;

    /**
     * 分拣日期
     */
    @TableField("OB_SORT_DATE")
    private LocalDateTime obSortDate;

    /**
     * 件烟派生码
     */
    @TableField("OB_CIG_DERIVE_CODE")
    private String obCigDeriveCode;

    /**
     * 条烟码段自定义信息
     */
    @TableField("OB_CUSTOM_INFO")
    private String obCustomInfo;

    /**
     * 零售户代码
     */
    @TableField("OB_RETAILER_CODE")
    private String obRetailerCode;

    /**
     * ob_bcig_barcode条烟码段
     */
    @TableField("OB_BCIG_BARCODE")
    private String obBcigBarcode;

    /**
     *  
     */
    @TableField("OB_TOTAL_SEQUENCE")
    private Long obTotalSequence;

    /**
     *  
     */
    @TableField("OB_LOCK_STEP")
    private String obLockStep;

    /**
     *  
     */
    @TableField("OB_LOCK_STATUS")
    private String obLockStatus;

    /**
     * mysql主键
     */
    @TableId("ID")
    private String id;


}
