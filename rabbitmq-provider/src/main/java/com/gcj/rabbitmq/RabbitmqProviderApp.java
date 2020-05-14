package com.gcj.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class RabbitmqProviderApp {

    public static void main(String[] args) {
    	SpringApplication springApplication = new SpringApplication(RabbitmqProviderApp.class);
    	springApplication.run(args);
    }
}
