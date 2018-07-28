package com.jr.rabbit.Producer;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

    static final String Q = "hello q, looking q";

    @Bean
    Queue queue(){
        return new Queue(Q);
    }

    public static void main(String[] args){
        SpringApplication.run(com.jr.rabbit.Consumer.Application.class, args);
    }
}
