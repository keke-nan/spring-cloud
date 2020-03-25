package com.autel.eureka.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A20019
 * @date 2020/3/24
 */

@RestController
@RequestMapping("/app")
public class AppController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/port")
    public String getPort(){
        return name + ": "+ port;
    }
}
