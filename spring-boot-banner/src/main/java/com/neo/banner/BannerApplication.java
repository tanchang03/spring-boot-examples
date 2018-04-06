package com.neo.banner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(BannerApplication.class);
//		SpringApplication.run(BannerApplication.class, args);
//		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
