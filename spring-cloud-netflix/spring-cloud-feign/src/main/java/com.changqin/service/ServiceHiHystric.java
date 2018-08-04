package com.changqin.service;

import org.springframework.stereotype.Component;

@Component
public class ServiceHiHystric  implements FeignService{

    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}