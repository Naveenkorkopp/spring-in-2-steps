package com.in28minutes.spring.basics.springin2steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Qualifier("quick")
public class QuickStartAlgorithm implements SortAlgorithm{

	
	public int[] sort(int[] numbers) {

		return numbers;
	}

}
