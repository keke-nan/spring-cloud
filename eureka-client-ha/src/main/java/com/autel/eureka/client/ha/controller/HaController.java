package com.autel.eureka.client.ha.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A20019
 * @date 2020/3/24
 */

@RestController
@RequestMapping("/ha")
public class HaController {

    @Value("${spring.application.name}")
    private String name;

    @GetMapping("/name")
    public String getName(){
        return name;
    }
}
