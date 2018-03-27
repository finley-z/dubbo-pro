package org.sang;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sang on 2017/8/24.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        SayHello sayHello = (SayHello) ctx.getBean("sayHello");
        String s = sayHello.sayHello("张三");
        System.out.println(s);
    }
}
