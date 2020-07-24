package com.mobiusvision.qrcode.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mobiusvision.qrcode.entity.BpOrderInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
public interface IBpOrderInfoService extends IService<BpOrderInfo> {

    IPage<BpOrderInfo> findPage(BpOrderInfo var1, int var2, int var3);

    IPage<BpOrderInfo> findPage(int var1, int var2);

    List<BpOrderInfo> findList(BpOrderInfo var1);

    void delete(List<String> var1, String var2);

    void update(BpOrderInfo var1, String var2);

    void add(BpOrderInfo var1, String var2);

    BpOrderInfo findById(String var1);

    List<BpOrderInfo> findAll();
}
