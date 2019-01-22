package com.coffee.baby.pattern.adapter;

/**
 * @Classname AdapterClient
 * @Description TODO
 * @Date 2019/1/22 9:18
 * @Created by smile.szx
 */
public class AdapterClient {

    public static void main(String[] args) {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("zhengxiao").setPassWord("12345").setEmailAccount("zhengxiao@jd.com").setEmailPassWord("SZxwef");

        //对象适配器
        DBOperationServer operation = new DBOperationAdapter(new DBOperation());
        String code = operation.code(userInfo);
        System.out.println(code);


        //类适配器
        //类适配器具有局限性，目标类只能是接口，适配类不能为Final类，一次最多适配一个适配类
        DBOperationInterface dbOperation = new DBOperationClassAdapter();

        String codeClazz = dbOperation.code(userInfo);
        System.out.println(codeClazz);


    }
}
