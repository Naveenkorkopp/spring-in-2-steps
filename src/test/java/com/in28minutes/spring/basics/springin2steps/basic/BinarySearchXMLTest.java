package com.in28minutes.spring.basics.springin2steps.basic;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.in28minutes.spring.basics.springin2steps.SpringIn2StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
class BinarySearchXMLTest {
	
	@Autowired
	BinarySearchImpl binarySearch;
	
	@Test
	void testbasicScenarios() {
		int result = binarySearch.binarySearch(new int[] {}, 5);
		assertEquals(3, result);

	}

}
