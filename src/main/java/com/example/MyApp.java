package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class MyApp {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("randomMessageService", MessageService.class);

        System.out.println("Hashcode zmiennej 1 ->" + messageService.hashCode());
        System.out.println("Hashcode zmiennej 2 ->" + messageService2.hashCode());

        System.out.println(messageService.getMessage());

        applicationContext.close();
    }
}
