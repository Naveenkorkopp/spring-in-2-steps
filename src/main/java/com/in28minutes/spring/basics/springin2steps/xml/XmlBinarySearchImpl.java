package com.in28minutes.spring.basics.springin2steps.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlBinarySearchImpl {
	
	private Logger LOGGER = LoggerFactory.getLogger(XmlBinarySearchImpl.class);

	private XmlSortAlgorithm xmlSortAlgorithm;

	public XmlSortAlgorithm getXmlSortAlgorithm() {
		return xmlSortAlgorithm;
	}

	public void setXmlSortAlgorithm(XmlSortAlgorithm xmlSortAlgorithm) {
		this.xmlSortAlgorithm = xmlSortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToBeSearched) {
		
		int[] sortedNumbers = xmlSortAlgorithm.sort(numbers);
		
		LOGGER.info("{}", xmlSortAlgorithm);
		
		return 3;
	}

}
