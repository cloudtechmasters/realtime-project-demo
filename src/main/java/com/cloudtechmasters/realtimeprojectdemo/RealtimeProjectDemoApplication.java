package com.cloudtechmasters.realtimeprojectdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cloudtechmasters.realtimeprojectdemo"})
public class RealtimeProjectDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealtimeProjectDemoApplication.class, args);
	}

}
