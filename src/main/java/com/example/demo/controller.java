package com.example.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.dubbo.service.ABCService;
import com.example.demo.dubbo.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {
    @Reference
    TestService testService;
    @GetMapping("/test")
    public Object te(){
        return testService.str();
    }
}
