package com.example.ioc_di.beans;

import com.example.ioc_di.beans.beans.Dev;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeansApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BeansApplication.class, args);

		Dev dev = context.getBean(Dev.class);

		dev.doWork();
	}

}
