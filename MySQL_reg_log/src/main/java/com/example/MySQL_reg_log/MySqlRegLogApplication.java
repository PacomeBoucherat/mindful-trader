package com.example.MySQL_reg_log;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class MySqlRegLogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySqlRegLogApplication.class, args);
	}

}
