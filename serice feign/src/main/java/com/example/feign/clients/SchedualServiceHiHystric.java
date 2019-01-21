package com.example.feign.clients;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String hello(String name) {
        return "sorry, you are fail,"+name;
    }
}