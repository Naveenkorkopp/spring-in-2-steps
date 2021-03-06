package com.in28minutes.spring.basics.springin2steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentscan.ComponentDAO;


@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentscan") 
public class SpringIn2StepsComponentScanApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn2StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =  
				new AnnotationConfigApplicationContext(SpringIn2StepsComponentScanApplication.class)) {

			ComponentDAO componentDao = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDao);

		}
		
	}

}
