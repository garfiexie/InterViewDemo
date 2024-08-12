package com.ctrip.hotel.tool.configuration;

import com.ctrip.hotel.tool.DemoImpl;
import com.ctriposs.baiji.rpc.extensions.springboot.BaijiRegistrationBean;
import org.springframework.context.annotation.Configuration;

/**
 * @author h_jie
 * @date 2020/5/7 18:21
 */
@Configuration
public class BaijiServletConfiguration extends BaijiRegistrationBean {

    protected BaijiServletConfiguration() {
        super("/api/*", DemoImpl.class);
    }
}
