package com.ctrip.hotel.tool.configuration;

import com.dianping.cat.servlet.CatFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

/**
 * @author h_jie
 * @date 2020/5/7 18:21
 */
@Configuration
public class CatFilterConfiguration {
    @Bean
    public FilterRegistrationBean catFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean(new CatFilter());
        registration.addUrlPatterns("/*");
        registration.setDispatcherTypes(DispatcherType.REQUEST);
        registration.setDispatcherTypes(DispatcherType.FORWARD);
        registration.setName("cat-filter");
        return registration;
    }
}
