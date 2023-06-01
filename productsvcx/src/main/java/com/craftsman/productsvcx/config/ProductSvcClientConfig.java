package com.craftsman.productsvcx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProductSvcClientConfig {

	@Bean
	WebClient webClient(ProductSvcClientProperties clientProperties, WebClient.Builder webClientBuilder) {
		return webClientBuilder
				.baseUrl(clientProperties.webservice().toString())
				.build();
	}

}
