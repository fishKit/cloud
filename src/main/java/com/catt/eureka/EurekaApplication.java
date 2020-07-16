package com.catt.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/***
 * @Author: Huang Zhi Jie
 * @Description: http://localhost:7000/
 * @Date: 2020/7/14  19:37
 * @Param null:
 * @return: null
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
