package com.mobiusvision.qrcode.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mobiusvision.qrcode.entity.BpOrderCigInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_ORDER_CIG_INFO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
public interface IBpOrderCigInfoService extends IService<BpOrderCigInfo> {

    IPage<mysql_BP_ORDER_CIG_INFO> findPage(mysql_BP_ORDER_CIG_INFO var1, int var2, int var3);

    IPage<mysql_BP_ORDER_CIG_INFO> findPage(int var1, int var2);

    List<mysql_BP_ORDER_CIG_INFO> findList(mysql_BP_ORDER_CIG_INFO var1);

    void delete(List<String> var1, String var2);

    void update(mysql_BP_ORDER_CIG_INFO var1, String var2);

    void add(mysql_BP_ORDER_CIG_INFO var1, String var2);

    mysql_BP_ORDER_CIG_INFO findById(String var1);

    List<mysql_BP_ORDER_CIG_INFO> findAll();
}
