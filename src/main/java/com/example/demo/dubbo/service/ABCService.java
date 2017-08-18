package com.example.demo.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component
public class ABCService {
    @Reference(version = "1.0.0")
    public TestService testService;
    @Reference(version = "1.0.0")
    public HelloService helloService;
}
