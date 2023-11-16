package com.example.team2_be.core.config;

import feign.Client;
import feign.Logger;
import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.InetSocketAddress;
import java.net.Proxy;

@Configuration
public class AuthFeignConfig {
    @Bean
    public Client feignClient(okhttp3.OkHttpClient okHttpClient) {
        return new OkHttpClient(okHttpClient);
    }

    @Bean
    public okhttp3.OkHttpClient okHttpClient() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("krmp-proxy.9rum.cc", 3128));
        return new okhttp3.OkHttpClient.Builder().proxy(proxy).build();
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
