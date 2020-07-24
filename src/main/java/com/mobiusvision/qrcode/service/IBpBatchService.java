package com.mobiusvision.qrcode.service;

import com.mobiusvision.qrcode.entity.BpBatch;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mobiusvision.qrcode.entity.mysql.mysql_BP_BATCH;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
public interface IBpBatchService extends IService<BpBatch> {

    void delete(List<String> var1, String var2);

    void update(mysql_BP_BATCH var1, String var2);

    void add(mysql_BP_BATCH var1, String var2);

    BpBatch findById(String var1);

    List<BpBatch> findAll();
}
