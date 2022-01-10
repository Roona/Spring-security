package com.way2learnonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
@EnableResourceServer
@SpringBootApplication
public class ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceServerApplication.class, args);
	}
	
	/*
	
	@Bean
	public RemoteTokenServices tokenService(){
		RemoteTokenServices tokenService = new RemoteTokenServices();
		tokenService.setCheckTokenEndpointUrl("http://localhost:9999/auth/oauth/check_token");
		tokenService.setClientId("microclient");
		tokenService.setClientSecret("secret");
		
		return tokenService;
	}
	
	*/

}
