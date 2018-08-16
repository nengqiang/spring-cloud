package com.hnq.study.config;

import com.hnq.study.bean.Aliyun;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author henengqiang
 * @date 2018/8/16
 */
@SpringBootConfiguration
public class Configuration {

    @Value("${appKey}")
    private String appKey;

    @Value("${appSecret}")
    private String appSecret;

    @Value("${bucket}")
    private String bucket;

    @Value("${endPoint}")
    private String endPoint;

    @Bean
    public Aliyun aliyun() {
        return Aliyun.options().setAppKey(appKey).setAppSecret(appSecret).setBucket(bucket).setEndPoint(endPoint).build();
    }

}
