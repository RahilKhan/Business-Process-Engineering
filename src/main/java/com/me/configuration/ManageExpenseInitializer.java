package com.me.configuration;
/*
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
*/
import javax.servlet.Filter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//public class HelloWorldInitializer implements WebApplicationInitializer {
public class ManageExpenseInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	/*
	 * public void onStartup(ServletContext container) throws ServletException {
	 * 
	 * AnnotationConfigWebApplicationContext ctx = new
	 * AnnotationConfigWebApplicationContext();
	 * ctx.register(HelloWorldConfiguration.class);
	 * ctx.setServletContext(container);
	 * 
	 * ServletRegistration.Dynamic servlet = container.addServlet( "dispatcher",
	 * new DispatcherServlet(ctx));
	 * 
	 * servlet.setLoadOnStartup(1); servlet.addMapping("/"); }
	 */

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { ManageExpenseConfiguration.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	@Override
	protected Filter[] getServletFilters() {
		Filter[] singleton = { new CORSFilter() };
		return singleton;
	}

}
