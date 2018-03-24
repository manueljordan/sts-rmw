package com.manuel.jordan.config.view;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
@Configuration
@Profile("request-mappings-view")
@ComponentScan(basePackages= {"com.manuel.jordan.controller","com.manuel.jordan.rest"})
public class RequestMappingsViewConfig {

	@Bean
	public String requestMappingsView() {
		return "requestMappingsView";
	}

}