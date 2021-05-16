package com.in28minutes.spring.basics.springin2steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin2steps.cdi.SomeCDIBusiness;


@Configuration
@ComponentScan
public class SpringIn2StepsCdiApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn2StepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =  
				new AnnotationConfigApplicationContext(SpringIn2StepsCdiApplication.class)) {
			
			SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
			
			LOGGER.info("{} dao-{}", business, business.getSomeCDIDao());
		}
		
	}

}
