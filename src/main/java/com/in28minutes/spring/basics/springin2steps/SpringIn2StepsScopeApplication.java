package com.in28minutes.spring.basics.springin2steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin2steps.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringIn2StepsScopeApplication {

	private static Logger LOGGER = 
			LoggerFactory.getLogger(SpringIn2StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =  
				new AnnotationConfigApplicationContext(SpringIn2StepsScopeApplication.class)) {
			
			PersonDAO personDao = applicationContext.getBean(PersonDAO.class);
			
			PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbvConnection());
			LOGGER.info("{}", personDao.getJdbvConnection());
			LOGGER.info("{}", personDao2);
			LOGGER.info("{}", personDao2.getJdbvConnection());

		}

	}

}
