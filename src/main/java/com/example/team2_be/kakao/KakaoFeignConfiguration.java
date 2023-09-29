package com.example.team2_be.kakao;

import feign.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KakaoFeignConfiguration {
        @Bean
        public Client feignClient() {
            return new Client.Default(null, null);
        }
}

