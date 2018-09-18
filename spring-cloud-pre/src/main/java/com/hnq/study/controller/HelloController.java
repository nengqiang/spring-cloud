package com.hnq.study.controller;

import com.alibaba.fastjson.JSON;
import com.hnq.study.bean.Aliyun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author henengqiang
 * @date 2018/8/16
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private Aliyun aliyun;

    @RequestMapping("/hi")
    public String sayHi() {
        return "Hi";
    }

    @RequestMapping("/aliyun")
    public String createAliyun() {
        return JSON.toJSONString(aliyun);
    }

}
