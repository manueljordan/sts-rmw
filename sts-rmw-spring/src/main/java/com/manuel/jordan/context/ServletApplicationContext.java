package com.manuel.jordan.context;

import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
@ComponentScan(basePackages = {
		"com.manuel.jordan.config.mvc",
		"com.manuel.jordan.config.view",
		"com.manuel.jordan.controller",
		"com.manuel.jordan.rest"
})
public class ServletApplicationContext {

}