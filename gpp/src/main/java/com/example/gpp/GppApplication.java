package com.example.gpp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan
@SpringBootApplication
public class GppApplication {

	public static void main(String[] args) {
		SpringApplication.run(GppApplication.class, args);
	}

}
