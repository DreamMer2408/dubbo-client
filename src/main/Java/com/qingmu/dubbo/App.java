package com.qingmu.dubbo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-client.xml");
        context.start();

        IQmHello iQmHello=(IQmHello)context.getBean("qmHello");
        System.out.println(iQmHello.sayHello("Mic"));
    }
}
