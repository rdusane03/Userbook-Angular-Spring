package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class DemoAngularSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAngularSpringApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfigurationAPI1()
	{	
	return new Docket(DocumentationType.SWAGGER_2)
		.groupName("API1")
	.select()
	.paths(PathSelectors.ant("/api/*/*"))
	.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
	.build().apiInfo(apiDetails());
	}
	
	 @Bean
	    public Docket swaggerConfiguration1API2() {
	        return new Docket(DocumentationType.SWAGGER_2)
	        		.groupName("API2")
	                .select()
	                .paths(PathSelectors.ant("/api/*"))
	                .apis(RequestHandlerSelectors.basePackage("com.example.demo"))
	                .build().apiInfo(apiDetails());
	    }

	 private ApiInfo apiDetails()
	 {
		
		 return new ApiInfo(
				 "User Details API",
				 "Sample API",
				 "Free to Use",
				 "Contact", new springfox.documentation.service.Contact("Mr. ABC", "http://abc.com", "abc@gmail.com"),
				 "API License",
				 "http://abc.com", Collections.emptyList());	
	 }

}
