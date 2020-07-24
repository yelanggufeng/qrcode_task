package com.mobiusvision.qrcode.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mobiusvision.qrcode.entity.ViCustmsg;
import org.springframework.stereotype.Repository;

@Repository
@DS("slave")
public interface ViCustmsgMapper extends BaseMapper<ViCustmsg> {
}
