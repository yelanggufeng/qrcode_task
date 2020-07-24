package com.mobiusvision.qrcode.entity;

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
public class Tobacco implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    private Integer id;

    /**
     * 包装
     */
    private String packing;

    /**
     * 条装(多少盒)
     */
    private String stripPacking;

    /**
     * 盒装(多少只)
     */
    private String boxPacking;

    /**
     * 烟草品牌
     */
    private String tobaccoBrand;

    /**
     * 烟草型号
     */
    private String tobaccoModel;

    /**
     * 图片
     */
    private String tobaccoImg;

    /**
     * 条盒条码
     */
    private String barCode;


}
