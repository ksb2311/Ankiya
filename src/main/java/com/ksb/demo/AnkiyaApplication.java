package com.ksb.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.ksb.demo.controller.SimpleController;

@SpringBootApplication
@ComponentScan(basePackageClasses = SimpleController.class)
public class AnkiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnkiyaApplication.class, args);
	}
}
