package com.autel.feign.service.service;

import com.autel.feign.service.fallback.InfoFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author A20019
 * @date 2020/3/24
 */

@FeignClient(value = "eureka-client-ha",path = "/ha",fallback = InfoFallback.class)
public interface InfoService {

    @GetMapping("/name")
    String getName();
}
