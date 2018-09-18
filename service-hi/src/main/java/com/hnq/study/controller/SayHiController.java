package com.hnq.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author henengqiang
 * @date 2018/9/18
 */
@RestController
public class SayHiController {

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
    public String callHome() {
        return restTemplate.getForObject("http://localhost:8989/hello", String.class);
    }

    @RequestMapping(value = "/info")
    public String getInfo() {
        return "I'm service-hi";
    }

}
