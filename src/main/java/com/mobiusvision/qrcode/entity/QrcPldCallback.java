package com.mobiusvision.qrcode.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("qrc_pld_callback")
public class QrcPldCallback implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId("ID")
    private String id;

    @TableField("QRCODE")
    private String qrcode;

    /**
     * 来源哪台机器
     */
    @TableField("SOURCE")
    private String source;

    /**
     * 打码时间
     */
    @TableField("CODING_TIME")
    private LocalDateTime codingTime;

    /**
     * 打码次数
     */
    @TableField("CHECK_TIMES")
    private Integer checkTimes;


}
