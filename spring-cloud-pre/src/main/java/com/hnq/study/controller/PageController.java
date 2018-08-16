package com.hnq.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 这里需要返回页面所以不能用 <code>@RestController</code> 注解，因为其返回的是 json 数据格式
 *
 * @author henengqiang
 * @date 2018/8/16
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}
