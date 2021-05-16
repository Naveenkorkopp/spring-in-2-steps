package com.in28minutes.spring.basics.springin2steps;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.springin2steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn2StepsBasicApplication {
	
	private static Logger LOGGER =
			LoggerFactory.getLogger(SpringIn2StepsBasicApplication.class);

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());
		
		try(AnnotationConfigApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(
						SpringIn2StepsBasicApplication.class)) {

		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);

		LOGGER.info("{}", binarySearch);
		LOGGER.info("{}", binarySearch1);
		

		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		
		LOGGER.info("{}", result);
		
		}

	}
}
