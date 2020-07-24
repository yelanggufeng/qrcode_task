package com.mobiusvision.qrcode.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mobiusvision.qrcode.entity.Tobacco;
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
public interface ITobaccoService extends IService<Tobacco> {

    IPage<Tobacco> findPage(Tobacco var1, int var2, int var3);

    IPage<Tobacco> findPage(int var1, int var2);

    List<Tobacco> findList(Tobacco var1);

    void update(Tobacco var1);

    void add(Tobacco var1);

    Tobacco findById(Integer var1);

    List<Tobacco> findAll();
}
