package com.hnq.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author henengqiang
 * @date 2018/9/8
 */
@RestController
public class HiController {

    @Value("${turkey}")
    private String turkey;

    @RequestMapping(value = "/hi")
    public String hi() {
        return turkey;
    }

}
