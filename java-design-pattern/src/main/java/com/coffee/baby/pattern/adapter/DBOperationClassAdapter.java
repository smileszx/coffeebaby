package com.coffee.baby.pattern.adapter;

/**
 * @Classname DBOperationClassAdapter
 * @Description TODO
 * @Date 2019/1/22 9:38
 * @Created by smile.szx
 */
public class DBOperationClassAdapter extends DBOperation implements DBOperationInterface {
    @Override
    public String code(UserInfo userInfo) {
        return super.codeByMD5(userInfo);
    }
}
