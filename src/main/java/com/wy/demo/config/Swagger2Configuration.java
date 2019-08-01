package com.wy.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Configuration {

	@Bean("111111")
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("111111")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.wy.demo.web"))
				.paths(PathSelectors.any())
				.build();
	}
	@Bean("222222")
	public Docket createRestApi2() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("222222")
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.wy.demo.web2"))
				.paths(PathSelectors.any())
				
				.build();
	}
	
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("标题")
				.description("描述")
				
//				.termsOfServiceUrl("http://localhost") 
				.version("1.0")
				.build();
	}
}
