package com.miniproject2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.miniproject.controller")) 
				.paths(PathSelectors.any())
				.build();
	}
	                                   
	
	
	@SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("CONTACTS API")
				.description("Contacts API ")
				.termsOfServiceUrl("http://contacts.com")
				.contact("ashokit@gmail.com")
				.license("JavaInUse License")
				.licenseUrl("javainuse@gmail.com")
				.version("1.0").build();
	}

	}

