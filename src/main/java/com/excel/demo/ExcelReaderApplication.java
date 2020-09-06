package com.excel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories("com.excel.demo.*")
@ComponentScan(basePackages = { "com.excel.demo.*" })
@EntityScan("com.excel.demo.*")
public class ExcelReaderApplication {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(ExcelReaderApplication.class, args);
	}

}
