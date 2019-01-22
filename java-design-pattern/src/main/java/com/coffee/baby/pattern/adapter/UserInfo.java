package com.coffee.baby.pattern.adapter;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @Classname UserInfo
 * @Description 用户信息
 * @Date 2019/1/22 9:06
 * @Created by smile.szx
 */
@Getter
@Setter
@ToString
@Accessors(chain = true)
public class UserInfo {

    private String userName;

    private transient String passWord;

    private String emailAccount;

    private transient String emailPassWord;

}
