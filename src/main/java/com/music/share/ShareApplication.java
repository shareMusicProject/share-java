package com.music.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class ShareApplication {

	@RequestMapping("/hello")
	String index(){
		return "hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(ShareApplication.class, args);
	}
}
