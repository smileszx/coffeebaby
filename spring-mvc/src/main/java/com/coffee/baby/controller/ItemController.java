package com.coffee.baby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname ItemController
 * @Description TODO
 * @Date 2019/1/17 15:45
 * @Created by smile.szx
 */
@Controller
public class ItemController {

    @RequestMapping("test")
    @ResponseBody
    public String test () {
        return "test";
    }

}
