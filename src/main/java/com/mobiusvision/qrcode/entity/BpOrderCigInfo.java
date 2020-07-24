package com.mobiusvision.qrcode.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("bp_order_cig_info")
public class BpOrderCigInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("OCI_ID")
    private Long ociId;

    @TableField("OCI_UUID")
    private String ociUuid;

    @TableField("OCI_CIG_BRAND")
    private String ociCigBrand;

    @TableField("OCI_CIG_TRADEMARK")
    private String ociCigTrademark;

    @TableField("OCI_IS_ABNORMAL")
    private String ociIsAbnormal;

    @TableField("OCI_IS_PRINT")
    private String ociIsPrint;

    @TableField("OCI_ORDER_NUM")
    private Integer ociOrderNum;

    @TableField("OCI_ORDER_NUM1")
    private BigDecimal ociOrderNum1;

    @TableField("OCI_ACTUAL_PRICE")
    private BigDecimal ociActualPrice;

    @TableField("OCI_STANDERD_PRICE")
    private BigDecimal ociStanderdPrice;

    @TableField("OCI_LOCK_STEP")
    private String ociLockStep;

    @TableField("OCI_LOCK_STATUS")
    private String ociLockStatus;

    @TableField("OCI_CUSTOM_INFO")
    private String ociCustomInfo;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;


}
