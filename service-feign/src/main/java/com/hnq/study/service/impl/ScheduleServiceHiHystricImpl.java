package com.hnq.study.service.impl;

import com.hnq.study.service.ScheduleServiceHi;
import org.springframework.stereotype.Service;

/**
 * @author henengqiang
 * @date 2018/9/4
 */
@Service
public class ScheduleServiceHiHystricImpl implements ScheduleServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "hi, " + name + ", Sorry, there has occurred an error!";
    }

}
