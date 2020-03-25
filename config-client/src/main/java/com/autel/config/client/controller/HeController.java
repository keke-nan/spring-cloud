package com.autel.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author A20019
 * @date 2020/3/24
 *
 * @RefreshScope ，会自动获取git上配置文件的更新，无需重新启动项目
 */

@RestController
@RefreshScope
public class HeController {

    /*@Value("${config.hello}")*/
    private String hel;

    @GetMapping("/hello")
    public String getHel(){
        return this.hel;
    }
}
