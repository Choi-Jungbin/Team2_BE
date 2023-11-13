package com.example.team2_be.core.config;

import feign.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import java.net.InetSocketAddress;
import java.net.Proxy;

@Configuration
public class AuthFeignConfig {

    @Bean
    public Client feignClient () {
        return  new  Client .Proxied( null , null ,
                new  Proxy (Proxy.Type.HTTP,
                        new  InetSocketAddress ("krmp-proxy.9rum.cc", 3128)));
    }
}
