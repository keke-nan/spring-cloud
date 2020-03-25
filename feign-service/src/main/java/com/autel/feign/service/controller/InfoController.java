package com.autel.feign.service.controller;

import com.autel.feign.service.service.InfoService;
import com.sun.org.apache.xpath.internal.functions.FuncQname;
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
@RequestMapping("/info")
public class InfoController {

    @Autowired
    //@Qualifier("infoFallback")
    private InfoService service;

    @GetMapping("/get")
    public String get(){
        return service.getName();
    }
}
