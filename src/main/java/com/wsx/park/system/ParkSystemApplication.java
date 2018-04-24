package com.wsx.park.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.wsx.park.system"})
@EntityScan("com.wsx.park.system.domain")
@EnableAutoConfiguration
public class ParkSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(ParkSystemApplication.class, args);
	}
}
