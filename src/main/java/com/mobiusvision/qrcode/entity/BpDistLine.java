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
@TableName("bp_dist_line")
public class BpDistLine implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("DL_ID")
    private Long dlId;

    /**
     * 线路唯一标识
     */
    @TableField("DL_UUID")
    private String dlUuid;

    /**
     * 分拣日期
     */
    @TableField("DL_SORT_DATE")
    private LocalDateTime dlSortDate;

    /**
     * 批次唯一标识
     */
    @TableField("DL_B_UUID")
    private String dlBUuid;

    /**
     * 批次编号
     */
    @TableField("DL_B_CODE")
    private String dlBCode;

    /**
     * 批次类型
     */
    @TableField("DL_B_TYPE")
    private String dlBType;

    /**
     * 线路编号
     */
    @TableField("DL_CODE")
    private String dlCode;

    /**
     * 线路名称
     */
    @TableField("DL_NAME")
    private String dlName;

    /**
     * 线路顺序
     */
    @TableField("DL_SEQUENCE")
    private Integer dlSequence;

    /**
     * 订单数据(个)
     */
    @TableField("DL_ORDER_NUM")
    private Integer dlOrderNum;

    /**
     * 订单打码数量（个）
     */
    @TableField("DL_PRINT_NUM")
    private Integer dlPrintNum;

    /**
     * 批次完成时间
     */
    @TableField("DL_START_TIME")
    private LocalDateTime dlStartTime;

    /**
     * 批次完成时间
     */
    @TableField("DL_END_TIME")
    private LocalDateTime dlEndTime;

    /**
     * 状态 （0-未开始，1-执行中，2-批次已完成）
     */
    @TableField("DL_STATE")
    private String dlState;

    /**
     * 回送状态  （0-未回送 1-已回送）
     */
    @TableField("DL_SEND_STATE")
    private String dlSendState;

    /**
     * 本地更新时间
     */
    @TableField("DL_SELF_UPDATE_TIME")
    private LocalDateTime dlSelfUpdateTime;

    /**
     * 下级更新时间
     */
    @TableField("DL_SUB_UPDATE_TIME")
    private LocalDateTime dlSubUpdateTime;

    /**
     * mysql主键
     */
    @TableId("ID")
    private String id;


}
