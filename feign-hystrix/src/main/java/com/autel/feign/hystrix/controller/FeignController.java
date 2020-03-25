package com.autel.feign.hystrix.controller;

import com.autel.feign.hystrix.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A20019
 * @date 2020/3/24
 */

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignService service;

    @GetMapping("/get")
    public String get(){
        return service.getPort();
    }

    @GetMapping("/ss")
    public String sub(){
        return "kk";
    }
}
