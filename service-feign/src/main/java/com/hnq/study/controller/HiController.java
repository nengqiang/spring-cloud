package com.hnq.study.controller;

import com.hnq.study.service.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author henengqiang
 * @date 2018/8/28
 */
@RestController
public class HiController {

    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayhi(@RequestParam("name") String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }

}
