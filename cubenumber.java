package com.java;

import java.util.Scanner;

public class cubenumber {
public static void main(String arrgs[])	
{
	int i,n;
	System.out.println("input number of terms:");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++) {
		System.out.println("Number is:" +i+ "and cube of"+i+"is:" +(i*i*i));

	}
}

}
