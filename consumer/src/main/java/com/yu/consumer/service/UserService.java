package com.yu.consumer.service;

import com.yu.provider.service.TicketService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    //从注册中心拿需要的TicketService服务，Springboot2.x用的是DubboReference，Springboot1.x用的是Reference
    @DubboReference
    TicketService ticketService;

    public String sale(){
        return ticketService.sale();
    }
}
