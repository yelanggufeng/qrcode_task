package com.mobiusvision.qrcode.config;

import com.mobiusvision.qrcode.filter.OriginFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class FilterConfig {
    public FilterConfig() {
    }

    @Bean
    public FilterRegistrationBean originFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(this.originFilter());
        registration.addUrlPatterns(new String[]{"/*"});
        registration.setName("OriginFilter");
        registration.setOrder(9);
        return registration;
    }

    @Bean
    public Filter originFilter() {
        return new OriginFilter();
    }
}
