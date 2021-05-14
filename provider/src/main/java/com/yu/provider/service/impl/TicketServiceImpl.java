package com.yu.provider.service.impl;

import com.yu.provider.service.TicketService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * 应用启动起来，dubbo就会扫描指定的包下带有@component注解的服务，将它发布在指定的注册中心中！
 */
@DubboService  //将服务发布出去,Springboot2.x用的是DubboService，Springboot1.x用的是Service
@Component //放在容器中
public class TicketServiceImpl implements TicketService {

    @Override
    public String sale() {
        return "大话西游";
    }

}
