package com.hnq.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author henengqiang
 * @date 2018/9/8
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient01Application.class);
        System.out.println("====================>> ConfigClient01Application启动成功！");
    }

}
