package com.coffee.baby.pattern.adapter;

/**
 * @Classname DBOperationAdapter
 * @Description TODO
 * @Date 2019/1/22 9:11
 * @Created by smile.szx
 */
public class DBOperationAdapter extends DBOperationServer{

    private DBOperation dbOperation;

    public DBOperationAdapter(DBOperation dbOperation) {
        this.dbOperation = dbOperation;
    }

    /**
     * 复用系统原有加密算法
     * @param userInfo
     * @return
     */
    @Override
    public String code(UserInfo userInfo) {
        return dbOperation.codeByMD5(userInfo);
    }
}
