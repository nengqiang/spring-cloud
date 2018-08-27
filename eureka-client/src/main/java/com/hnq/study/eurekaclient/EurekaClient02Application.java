package com.hnq.study.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author henengqiang
 * @date 2018/8/27
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClient02Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient02Application.class, args);
        System.out.println("EurekaClient02启动成功！ ");
	}

}
