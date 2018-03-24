package com.manuel.jordan.context;

import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
@ComponentScan(basePackages = {
		"com.manuel.jordan.repository",
		"com.manuel.jordan.service"
})
public class RootApplicationContext {

}