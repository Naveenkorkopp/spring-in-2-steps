package com.in28minutes.spring.basics.springin2steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.spring.basics.springin2steps.xml.XmlBinarySearchImpl;


public class SpringIn2StepsXMLContextBasicApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn2StepsXMLContextBasicApplication.class);

	public static void main(String[] args) {

		try(ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml")) {

		XmlBinarySearchImpl xmlbinarySearch = applicationContext.getBean(XmlBinarySearchImpl.class);
		

		LOGGER.info("{}", xmlbinarySearch);

		int result = xmlbinarySearch.binarySearch(new int[] {12, 4, 6}, 3);

		LOGGER.info("{}", result);
		
		}

	}
}
