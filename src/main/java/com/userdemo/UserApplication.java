package com.userdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.userdemo.dao")
public class UserApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
	}
}
