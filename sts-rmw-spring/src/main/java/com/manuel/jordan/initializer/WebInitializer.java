package com.manuel.jordan.initializer;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.manuel.jordan.context.RootApplicationContext;
import com.manuel.jordan.context.ServletApplicationContext;

/**
 *
 * @author manueljordan
 * @since sts-rmw
 */
public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootApplicationContext.class};
	}

	/**
	 * {@inheritDoc}
	 *
	 * @see <a href="http://stackoverflow.com/questions/24726656/spring-profiles-not-recognized-in-a-web-application">Spring Profiles not recognized in a Web Application</a>
	 */
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		AnnotationConfigWebApplicationContext rootApplicationContext = new AnnotationConfigWebApplicationContext();
		rootApplicationContext.register(getRootConfigClasses());
		return rootApplicationContext;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{ServletApplicationContext.class};
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}