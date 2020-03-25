package com.autel.feign.hystrix.service;

import com.autel.feign.hystrix.fallback.HystrixFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author A20019
 * @date 2020/3/24
 */

@FeignClient(value = "eureka-client",path = "/app",fallback = HystrixFallback.class)
public interface FeignService {

    @GetMapping("/port")
    String getPort();
}
