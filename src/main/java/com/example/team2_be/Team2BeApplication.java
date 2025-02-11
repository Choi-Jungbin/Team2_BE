package com.example.team2_be;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableFeignClients
@SpringBootApplication
@EnableJpaAuditing
@EnableScheduling
public class Team2BeApplication {

	public static void main(String[] args) {
		System.setProperty("http.proxyHost", "krmp-proxy.9rum.cc");
		System.setProperty("http.proxyPort", "3128");
		SpringApplication.run(Team2BeApplication.class, args);
	}

}
