package com.JUnit_Testing;

public class Maxarray {
		int largest(int arr[],int size) {
		int i;
		int max=arr[0];
		for(i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max =arr[i];
			}
	}
		return max;
		}
}

