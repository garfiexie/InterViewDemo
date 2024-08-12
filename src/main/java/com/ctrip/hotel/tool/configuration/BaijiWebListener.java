package com.ctrip.hotel.tool.configuration;

import com.ctrip.hotel.tool.DemoImpl;
import com.ctriposs.baiji.rpc.formatter.protobuf.Protobuf2ContentFormatter;
import com.ctriposs.baiji.rpc.server.BaijiListener;
import com.ctriposs.baiji.rpc.server.HostConfig;
import javax.servlet.annotation.WebListener;

/**
 * @author h_jie
 * @date 2020/5/7 18:16
 */
@WebListener
public class BaijiWebListener extends BaijiListener {
    public BaijiWebListener() {
        super(DemoImpl.class);
    }

    @Override
    protected void configure(final HostConfig hostConfig) {
        super.configure(hostConfig);
        // 其他特殊配置
        hostConfig.contentFormatConfig.registerFormatter(new Protobuf2ContentFormatter());
        // 添加 ResponseFilter
        hostConfig.addResponseFilter((host, request, response, responseObj) -> {
//            Object obj = responseObj; // 响应对象
//            response.setHeader(BaseConfigConstants.Alliance_HttpCode,
//                    ConvertHelper.stringConvert(BookingResponseStatusEnum.)); // 设置 Header
//            response.getExecutionResult().responseSize(); // 获取响应大小
        });
    }
}
