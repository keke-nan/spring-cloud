package com.autel.feign.hystrix.fallback;

import com.autel.feign.hystrix.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @author A20019
 * @date 2020/3/24
 */

@Component
public class HystrixFallback implements FeignService {
    @Override
    public String getPort() {
        return "feign error,fallback";
    }
}
