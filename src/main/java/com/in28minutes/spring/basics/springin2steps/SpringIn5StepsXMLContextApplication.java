package com.in28minutes.spring.basics.springin2steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin2steps.xml.XmlPersonDAO;

public class SpringIn5StepsXMLContextApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn5StepsXMLContextApplication.class);

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

			XmlPersonDAO xmlPersonDao = applicationContext.getBean(XmlPersonDAO.class);
			
			LOGGER.info("Beans loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());

			LOGGER.info("{}", xmlPersonDao);
			LOGGER.info("{}", xmlPersonDao.getXmlJdbcConnection());
			
		}
	}
}
