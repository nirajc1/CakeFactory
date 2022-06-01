package com.example.CakeFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
public class CakeFactoryApplication {


	public static void main(String[] args) {

		SpringApplication.run(CakeFactoryApplication.class, args);


		/*SpringApplication application = new SpringApplication(CakeFactoryApplication.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8181"));
		application.run(args);*/
	}



}
