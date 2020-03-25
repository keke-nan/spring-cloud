package com.autel.feign.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 *  http://localhost:3500/hystrix
 *  http://localhost:3500/hystrix.stream
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients

@EnableHystrixDashboard
@EnableCircuitBreaker
public class FeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignServiceApplication.class, args);
    }

}
