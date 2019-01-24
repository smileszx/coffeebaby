package com.coffee.baby.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.Resource;

/**
 * @Description TODO
 * @Author Thinkpad
 * @Date 2019/1/23 23:33
 **/
@Slf4j
public class BeanFactoryTest {

    @Resource

    @Autowired

    public static void main(String[] args) {

        //https://blog.csdn.net/qq_41541619/article/details/79592225  XmlBeanFactory 3.1 废弃解决方案
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beanFactoryTest.xml");

//        MyTestBean bean = (MyTestBean) beanFactory.getBean("myTestBean");
//        System.out.println(bean.getTestStr());

        HelloBean helloBean = (HelloBean) beanFactory.getBean("helloBean");
        System.out.println(helloBean.getSetValue());
    }
}
