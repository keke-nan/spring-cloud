package com.autel.eureka.client.ha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientHaApplication.class, args);
    }

}
