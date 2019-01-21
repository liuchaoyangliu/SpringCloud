package com.example.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient
//@EnableHystrix
// @SpringCloudApplication 可代替 以上三个注解
@SpringCloudApplication
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run( RibbonApplication.class, args );
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

