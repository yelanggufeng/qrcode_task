package com.mobiusvision.qrcode.service;

import com.mobiusvision.qrcode.entity.QrcPldCallback;
import com.baomidou.mybatisplus.extension.service.IService;
import com.mobiusvision.qrcode.entity.QrcodeCheck;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author gufeng
 * @since 2020-07-17
 */
public interface IQrcPldCallbackService extends IService<QrcPldCallback> {

    QrcodeCheck checkQrcode(String var1) throws Exception;
}
