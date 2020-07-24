package com.mobiusvision.qrcode.config;

import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpClientConfiguration {
    @Value("${spring.httpclient.connectTimeout}")
    private Integer connectTimeout;
    @Value("${spring.httpclient.socketTimeout}")
    private Integer socketTimeout;
    @Value("${spring.httpclient.agent}")
    private String agent;
    @Value("${spring.httpclient.maxPerRoute}")
    private Integer maxPerRoute;
    @Value("${spring.httpclient.maxTotal}")
    private Integer maxTotal;

    public HttpClientConfiguration() {
    }

    @Bean
    public HttpClient httpClient() {
        RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(this.connectTimeout).setSocketTimeout(this.socketTimeout).build();
        HttpClient httpClient = HttpClientBuilder.create().setDefaultRequestConfig(requestConfig).setUserAgent(this.agent).setMaxConnPerRoute(this.maxPerRoute).setConnectionReuseStrategy(new NoConnectionReuseStrategy()).build();
        return httpClient;
    }
}

