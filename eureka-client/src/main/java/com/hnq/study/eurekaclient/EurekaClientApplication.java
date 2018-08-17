package com.hnq.study.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *  当 client 向 server 注册时，它会提供一些元数据，例如主机和端口，URL，主页等。Eureka server 从每个 client 实例接收心跳消息。
 * 如果心跳超时，则通常将该实例从注册 server 中删除。
 *
 * @author henengqiang
 * @date 2018/8/17
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
        System.out.println("EurekaClient启动成功！ ");
    }
}
