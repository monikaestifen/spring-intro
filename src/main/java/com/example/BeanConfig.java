package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MyNameMessageService myNameMessageService(){
        return new MyNameMessageService();
    }

    @Bean
    public RandomTextMessageService randomTextMessageService(){
        return new RandomTextMessageService();
    }

}
