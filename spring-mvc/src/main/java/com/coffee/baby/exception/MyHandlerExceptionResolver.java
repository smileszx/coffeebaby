package com.coffee.baby.exception;

import com.alibaba.fastjson.JSON;
import com.coffee.baby.dto.ResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;

/**
 * @Description 全局异常处理
 * @Author Thinkpad
 * @Date 2019/1/29 21:58
 **/
@Component
@Slf4j
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        //反射方法类
        Method method = null;
        if(handler != null && handler instanceof HandlerMethod) {
            method = ((HandlerMethod) handler).getMethod();
        }

        log.error("[{}] system error", method, ex);


        ResponseDTO responseDTO = ResponseDTO.builder().code("system error").build();

        //发生异常时，将ResponseDTO序列化为json对象给前端
        byte[] bytes = JSON.toJSONString(responseDTO).getBytes(StandardCharsets.UTF_8);

        try{
            FileCopyUtils.copy(bytes, response.getOutputStream());
        } catch (IOException e) {
            log.error("error", e);
            throw new RuntimeException(e);
        }

        return new ModelAndView();
    }
}
