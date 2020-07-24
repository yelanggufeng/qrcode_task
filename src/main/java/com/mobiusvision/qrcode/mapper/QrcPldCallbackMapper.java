package com.mobiusvision.qrcode.mapper;

import com.mobiusvision.qrcode.entity.QrcPldCallback;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
@Repository
public interface QrcPldCallbackMapper extends BaseMapper<QrcPldCallback> {

    Integer selectCountByQrcode(@Param("qrcode") String var1, @Param("begin") String var2, @Param("end") String var3);

    Integer updateCheckTimes(@Param("id") String var1);
}
