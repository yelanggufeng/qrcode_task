package com.mobiusvision.qrcode.entity;

import java.math.BigDecimal;
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
@TableName("bp_order_info")
public class BpOrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * mysql主键
     */
    @TableField("OI_ID")
    private Long oiId;

    /**
     * 订单唯一标识
     */
    @TableField("OI_UUID")
    private String oiUuid;

    /**
     * 批次编号
     */
    @TableField("OI_B_CODE")
    private String oiBCode;

    /**
     * 批次类型  （0-正常批次，1-换货批次）
     */
    @TableField("OI_B_TYPE")
    private String oiBType;

    /**
     * 是否换分拣线 （0-是，否）
     */
    @TableField("OI_ISCHANGE_SLINE")
    private String oiIschangeSline;

    /**
     * 线路唯一标识
     */
    @TableField("OI_DL_CODE")
    private String oiDlCode;

    /**
     * 线路编号
     */
    @TableField("OI_DL_NAME")
    private String oiDlName;

    /**
     * 分拣线编号
     */
    @TableField("OI_SLINE_CODE")
    private String oiSlineCode;

    /**
     * 分拣线名称
     */
    @TableField("OI_SLINE_NAME")
    private String oiSlineName;

    /**
     * 订单顺序号
     */
    @TableField("OI_SEQUENCE")
    private Integer oiSequence;

    /**
     * 订单号
     */
    @TableField("OI_CODE")
    private String oiCode;

    /**
     * 零售户代码
     */
    @TableField("OI_RETAILER_CODE")
    private String oiRetailerCode;

    /**
     * 零售户名称
     */
    @TableField("OI_RETAILER_NAME")
    private String oiRetailerName;

    /**
     * 订单日期
     */
    @TableField("OI_DATE")
    private LocalDateTime oiDate;

    /**
     * 分拣日期
     */
    @TableField("OI_SORT_DATE")
    private LocalDateTime oiSortDate;

    /**
     * 整件 标识 （0是，1否）
     */
    @TableField("OI_CIG_FLAG")
    private String oiCigFlag;

    /**
     * 订单量（条）
     */
    @TableField("OI_ALL_NUM")
    private Integer oiAllNum;

    /**
     * 订单量（万支）
     */
    @TableField("OI_NORMAL_NUM")
    private Integer oiNormalNum;

    /**
     *  
     */
    @TableField("OI_CUSTOM_INFO")
    private String oiCustomInfo;

    /**
     *  
     */
    @TableField("OI_CHECK_NUM")
    private Integer oiCheckNum;

    /**
     *  
     */
    @TableField("OI_SEND_NUM")
    private Integer oiSendNum;

    /**
     *  
     */
    @TableField("OI_PRINT_NUM")
    private Integer oiPrintNum;

    /**
     *  
     */
    @TableField("OI_RESEL_ORDER_NUM")
    private Integer oiReselOrderNum;

    /**
     *  
     */
    @TableField("OI_START_TIME")
    private LocalDateTime oiStartTime;

    /**
     *  
     */
    @TableField("OI_END_TIME")
    private LocalDateTime oiEndTime;

    /**
     *  
     */
    @TableField("OI_STATE")
    private String oiState;

    /**
     *   
     */
    @TableField("OI_SEND_STATE")
    private String oiSendState;

    /**
     *  
     */
    @TableField("OI_SELF_UPDATE_TIME")
    private LocalDateTime oiSelfUpdateTime;

    /**
     *  
     */
    @TableField("OI_SUB_UPDATE_TIME")
    private LocalDateTime oiSubUpdateTime;

    /**
     *  
     */
    @TableField("OI_B_UUID")
    private String oiBUuid;

    /**
     *  
     */
    @TableField("OI_DL_UUID")
    private String oiDlUuid;

    /**
     *  
     */
    @TableField("OI_SELF_SEQUENCE")
    private Integer oiSelfSequence;

    /**
     *    
     */
    @TableField("OI_ALL_NUM1")
    private BigDecimal oiAllNum1;

    /**
     *  
     */
    @TableField("OI_SELF_BATCH_SEQUENCE")
    private Integer oiSelfBatchSequence;

    /**
     *  
     */
    @TableField("OI_TOTAL_SEQUENCE")
    private Long oiTotalSequence;

    /**
     *  
     */
    @TableField("OI_ILLEGALITY_NUM")
    private Integer oiIllegalityNum;

    /**
     *  
     */
    @TableField("OI_SECOND_NUM")
    private Integer oiSecondNum;

    /**
     *  
     */
    @TableField("OI_COMMERCE_CODE")
    private String oiCommerceCode;

    /**
     *  
     */
    @TableField("OI_COMMERCE_NAME")
    private String oiCommerceName;

    /**
     *  
     */
    @TableField("OI_LOCAL_START_TIME")
    private LocalDateTime oiLocalStartTime;

    /**
     *    
     */
    @TableField("OI_STANDARD_START_TIME")
    private LocalDateTime oiStandardStartTime;

    /**
     *  
     */
    @TableField("OI_MONITOR_STATUS")
    private String oiMonitorStatus;

    /**
     *  
     */
    @TableField("OI_TIME_MONITOR_STATUS")
    private String oiTimeMonitorStatus;

    /**
     *  
     */
    @TableField("OI_STANDARD_TIME_TYPE")
    private String oiStandardTimeType;

    /**
     * mysql主键
     */
    @TableId("ID")
    private String id;


}
