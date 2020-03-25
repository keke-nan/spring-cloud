package com.autel.hystrix.dashboard.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 *    消息流：  http://localhost:3400/turbine.stream
 *    小熊 ：  http://localhost:3400/turbine.stream
 *
**/
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class HystrixDashboardTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardTurbineApplication.class, args);
    }

}
