package com.klinux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EvaluacionFraudeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionFraudeApplication.class, args);
	}

}
