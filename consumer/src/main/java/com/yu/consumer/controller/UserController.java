package com.yu.consumer.controller;

import com.yu.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/sale")
    public String sale() {
        String sale = userService.sale();
        return "从服务中心买到票了：" + sale;
    }

}
