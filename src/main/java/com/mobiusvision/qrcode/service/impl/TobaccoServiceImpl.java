package com.mobiusvision.qrcode.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mobiusvision.qrcode.entity.Tobacco;
import com.mobiusvision.qrcode.mapper.TobaccoMapper;
import com.mobiusvision.qrcode.service.ITobaccoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
@Service
public class TobaccoServiceImpl extends ServiceImpl<TobaccoMapper, Tobacco> implements ITobaccoService {

    @Autowired
    private TobaccoMapper tobaccoMapper;

    public TobaccoServiceImpl() {
    }

    public IPage<Tobacco> findPage(Tobacco tobacco, int pages, int limit) {
        IPage<Tobacco> page = new Page((long)pages, (long)limit);
        QueryWrapper queryWrapper = this.createWrapper(tobacco);
        return (IPage<Tobacco>) this.page(this.page(page, queryWrapper), queryWrapper);
    }

    public IPage<Tobacco> findPage(int pages, int limit) {
        IPage<Tobacco> page = new Page((long)pages, (long)limit);
        QueryWrapper<Tobacco> queryWrapper = new QueryWrapper();
        return this.page(this.page(page, queryWrapper), queryWrapper);
    }

    public List<Tobacco> findList(Tobacco tobacco) {
        QueryWrapper queryWrapper = this.createWrapper(tobacco);
        return this.tobaccoMapper.selectList(queryWrapper);
    }

    public QueryWrapper createWrapper(Tobacco tobacco) {
        QueryWrapper<Tobacco> queryWrapper = new QueryWrapper();
        if (tobacco != null) {
            if (!StringUtils.isEmpty(tobacco.getId())) {
                queryWrapper.eq("id", tobacco.getId());
            }

            if (!StringUtils.isEmpty(tobacco.getPacking())) {
                queryWrapper.eq("packing", tobacco.getPacking());
            }
        }

        return queryWrapper;
    }

    public void update(Tobacco tobacco) {
        this.tobaccoMapper.updateById(tobacco);
    }

    public void add(Tobacco tobacco) {
        this.tobaccoMapper.insert(tobacco);
    }

    public Tobacco findById(Integer id) {
        return (Tobacco)this.tobaccoMapper.selectById(id);
    }

    public List<Tobacco> findAll() {
        QueryWrapper<Tobacco> queryWrapper = new QueryWrapper();
        return this.tobaccoMapper.selectList(queryWrapper);
    }
}
