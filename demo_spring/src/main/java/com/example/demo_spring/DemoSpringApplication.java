package com.example.demo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSpringApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DemoSpringApplication.class, args);
        DeliveryService internetDeliveryService=new InternetDeliveryService();
		Messenger messenger=new Messenger(internetDeliveryService);
		messenger.sendMessange("hello!");
	}

}
