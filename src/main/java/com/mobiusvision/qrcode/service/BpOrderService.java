package com.mobiusvision.qrcode.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public interface BpOrderService {

    Map selectBdOrder(String var1, String var2);
}
