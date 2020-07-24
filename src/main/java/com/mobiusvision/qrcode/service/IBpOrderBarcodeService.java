package com.mobiusvision.qrcode.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mobiusvision.qrcode.entity.BpOrderBarcode;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_ORDER_BARCODE;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
public interface IBpOrderBarcodeService extends IService<BpOrderBarcode> {

    IPage<mysql_BP_ORDER_BARCODE> findPage(mysql_BP_ORDER_BARCODE var1, int var2, int var3);

    IPage<mysql_BP_ORDER_BARCODE> findPage(int var1, int var2);

    List<mysql_BP_ORDER_BARCODE> findList(mysql_BP_ORDER_BARCODE var1);

    void delete(List<Integer> var1, String var2);

    void update(mysql_BP_ORDER_BARCODE var1, String var2);

    void add(mysql_BP_ORDER_BARCODE var1, String var2);

    mysql_BP_ORDER_BARCODE findById(Integer var1);

    List<mysql_BP_ORDER_BARCODE> findAll();
}
