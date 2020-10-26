package com.spring.security.basicauthentication;

import com.spring.security.basicauthentication.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BasicAuthenticationApplication {

	public static void main(String[] args) {

		SpringApplication.run(new Class[] {BasicAuthenticationApplication.class, SecurityConfig.class}, args);

	}

}
