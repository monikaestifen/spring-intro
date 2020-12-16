package com.example;
import org.springframework.stereotype.Component;

//@Component("messageService")
@Component
public class MyNameMessageService implements MessageService {


    @Override
    public String getMessage() {
        return "Monika Stepien";
    }
}
