package com.autel.feign.service.fallback;


import com.autel.feign.service.service.InfoService;
import org.springframework.stereotype.Component;

/**
 * @author A20019
 * @date 2020/3/24
 */

@Component
public class InfoFallback implements InfoService {

    @Override
    public String getName() {
        return "fallback...";
    }
}
