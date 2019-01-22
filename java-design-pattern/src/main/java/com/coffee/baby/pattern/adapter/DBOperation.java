package com.coffee.baby.pattern.adapter;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Classname DBOperation
 * @Description 对象适配器模式
 * @Date 2019/1/22 9:03
 * @Created by smile.szx
 */
public class DBOperation {

    public String codeByMD5 (UserInfo userInfo) {
        String userMsg = userInfo.toString();
        String md5Code = md5(userMsg);

        return md5Code;
    }

    //md5加密的方法
    private String md5(String plainText) {
        //定义一个字节数组
        byte[] secretBytes = null;
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            //对字符串进行加密
            md.update(plainText.getBytes());
            //获得加密后的数据
            secretBytes = md.digest();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有md5这个算法！");
        }
        //将加密后的数据转换为16进制数字
        String md5code = new BigInteger(1, secretBytes).toString(16);// 16进制数字
        // 如果生成数字未满32位，需要前面补0
        for (int i = 0; i < 32 - md5code.length(); i++) {
            md5code = "0" + md5code;
        }
        return md5code;
    }
}
