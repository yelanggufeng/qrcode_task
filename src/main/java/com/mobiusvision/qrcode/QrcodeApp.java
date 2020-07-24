package com.mobiusvision.qrcode;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(
        exclude = {DruidDataSourceAutoConfigure.class}
)
@MapperScan({"com.mobiusvision.**.mapper"})
@EnableScheduling
public class QrcodeApp {
    public QrcodeApp() {
    }

    public static void main(String[] args) {
        SpringApplication.run(QrcodeApp.class, args);
    }
}
