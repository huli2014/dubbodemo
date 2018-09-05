package com.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author admin
 * @Title: StartUp
 * @ProjectName dubbodemo
 * @Description: TODO
 * @date 2018/9/316:35
 */
public class StartUp {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:application-mvc.xml"});
        context.start();
        System.out.println("-----dubbo开启-----");
        System.in.read();
    }
}
