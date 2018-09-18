package com.hnq.study.controller;

import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author henengqiang
 * @date 2018/9/18
 */
@RestController
public class SayHelloController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }

    @RequestMapping(value = "/hi")
    public String home() {
        return "Hi i'm hello";
    }

    @RequestMapping(value = "/hello")
    public String getInfo() {
        return restTemplate.getForObject("http://localhost:8988/info", String.class);
    }

}
