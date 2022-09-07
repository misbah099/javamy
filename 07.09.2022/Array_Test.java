package com.JUnit_Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array_Test {

	@Test
	void test() {
		Maxarray a=new Maxarray();
		int arr[]= {1,2,3,4,5};
		int size=arr.length;
		int actual=a.largest(arr,size);
		int expected=5;
		assertEquals(expected,actual);

	}

}
