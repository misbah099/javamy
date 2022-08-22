package com.java;

import java.util.Scanner;

public class primeno {
public static void main(String args[])
{
	System.out.println(" enter a no to  check prime or not");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int i=2,count=0;
	while(i<=num/2) {
		if(num%i==0) {
			count++;
			break;
		}
		i++;
	}
	if(count==0) {
		System.out.println(num+"is prime no");
	}
	else {
		
		System.out.println(num+"is not prime no");

	}
}
}
