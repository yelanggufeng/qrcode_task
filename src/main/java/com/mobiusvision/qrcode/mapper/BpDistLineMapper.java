package com.mobiusvision.qrcode.mapper;

import com.mobiusvision.qrcode.entity.BpDistLine;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
@Repository
public interface BpDistLineMapper extends BaseMapper<BpDistLine> {

    int deleteByIds(@Param("ids") List<String> var1, @Param("updateUser") String var2, @Param("updateTime") LocalDateTime var3);
}
