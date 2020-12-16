package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class MyApp {


    public static void main(String[] args) {

//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyNameMessageService.class, RandomTextMessageService.class);

//        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
//        MessageService messageService2 = applicationContext.getBean("randomMessageService", MessageService.class);
        MessageService messageService = ctx.getBean(MyNameMessageService.class);
        MessageService messageService2 = ctx.getBean(RandomTextMessageService.class);

        System.out.println("Hashcode zmiennej 1 ->" + messageService.hashCode());
        System.out.println("Hashcode zmiennej 2 ->" + messageService2.hashCode());

        System.out.println("wiadomosc zmiennej 1 ->" + messageService.getMessage());
        System.out.println("wiadomosc zmiennej 1 ->" + messageService2.getMessage());
    }
}
