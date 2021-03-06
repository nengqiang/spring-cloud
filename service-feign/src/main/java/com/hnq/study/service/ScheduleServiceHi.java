package com.hnq.study.service;

import com.hnq.study.service.impl.ScheduleServiceHiHystricImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author henengqiang
 * @date 2018/8/28
 */
@FeignClient(value = "service-hi", fallback = ScheduleServiceHiHystricImpl.class)
public interface ScheduleServiceHi {

    /**
     * sayHiFromClientOne
     * @param name  name
     * @return      a string
     */
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
