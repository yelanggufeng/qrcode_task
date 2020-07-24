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
@TableName("bp_batch")
public class BpBatch implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableField("B_ID")
    private Long bId;

    /**
     * 批次唯一标识
     */
    @TableField("B_UUID")
    private String bUuid;

    /**
     * 分拣日期
     */
    @TableField("B_SORT_DATE")
    private LocalDateTime bSortDate;

    /**
     * 批次类型 (0正常批次，1，换货批次)
     */
    @TableField("B_CODE")
    private String bCode;

    /**
     * 批次顺序号
     */
    @TableField("B_SEQUENCE")
    private Integer bSequence;

    /**
     * 批次类型
     */
    @TableField("B_TYPE")
    private String bType;

    /**
     * 是否换分拣线
     */
    @TableField("B_IS_CHANGE_SLINE")
    private String bIsChangeSline;

    /**
     * 分拣线编号
     */
    @TableField("B_SLINE_CODE")
    private String bSlineCode;

    /**
     * 订单数量 (个)
     */
    @TableField("B_ORDER_NUM")
    private Integer bOrderNum;

    /**
     * 应发送订单数量（个）
     */
    @TableField("B_SHOULD_SEND_NUM")
    private Integer bShouldSendNum;

    /**
     * 本次发送订单数零（个）
     */
    @TableField("B_THIS_SEND_NUM")
    private Integer bThisSendNum;

    /**
     * 订单接受数量 
     */
    @TableField("B_ALL_RECV_NUM")
    private Integer bAllRecvNum;

    /**
     * 订单打码数量 (个)
     */
    @TableField("B_PRINT_NUM")
    private Integer bPrintNum;

    /**
     * 批次启动时间
     */
    @TableField("B_START_TIME")
    private LocalDateTime bStartTime;

    /**
     * 批次完成时间
     */
    @TableField("B_END_TIME")
    private LocalDateTime bEndTime;

    /**
     * 状态   0 导入中  1导入完成  2 执行中  3 执行完成  
     */
    @TableField("B_STATE")
    private String bState;

    /**
     * 回送状态  0-未回送 1-已回送
     */
    @TableField("B_SEND_STATE")
    private String bSendState;

    /**
     * 订单数量 (个)
     */
    @TableField("B_SELF_UPDATE_TIME")
    private LocalDateTime bSelfUpdateTime;

    /**
     * 订单数量 (个)
     */
    @TableField("B_SUB_UPDATE_TIME")
    private LocalDateTime bSubUpdateTime;

    /**
     * mysql主键
     */
    @TableId("ID")
    private String id;


}
