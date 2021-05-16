package com.in28minutes.spring.basics.springin2steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.in28minutes.spring.basics.springin2steps.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn2StepsPropertiesApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn2StepsPropertiesApplication.class);

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
						SpringIn2StepsPropertiesApplication.class)) {

			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
		
			LOGGER.info("{}", service.returnServiceURL());
		
		}

	}
}
