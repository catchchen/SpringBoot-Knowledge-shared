package com.ch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.ch.dao")
@SpringBootApplication
public class ChApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChApplication.class, args);
	}
}
