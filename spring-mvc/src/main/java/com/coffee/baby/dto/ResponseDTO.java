package com.coffee.baby.dto;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/29 22:04
 **/
@Data
@Accessors(chain = true)
@Builder
public class ResponseDTO {

    private String code;

    private String msg;

    private String data;
}
