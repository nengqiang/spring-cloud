package com.hnq.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author henengqiang
 * @date 2018/9/12
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient02Application.class);
        System.out.println("====================>> ConfigClient02Application启动成功！");
    }

}
