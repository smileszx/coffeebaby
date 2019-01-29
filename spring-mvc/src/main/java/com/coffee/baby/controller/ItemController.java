package com.coffee.baby.controller;

import com.coffee.baby.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Classname ItemController
 * @Description TODO
 * @Date 2019/1/17 15:45
 * @Created by smile.szx
 */
@Controller
@RequestMapping("/api")
@Slf4j
public class ItemController {

    @RequestMapping("/test")
    @ResponseBody
    public String test () {
        return "test";
    }

    @ExceptionHandler(Exception.class)
    @RequestMapping("/error")
    @ResponseBody
    public ResponseDTO exceptionHandler(String error) {
        log.error("[{}] system error", error);

        return ResponseDTO.builder().code("error code").build();
    }
}