package com.java;

import java.util.Scanner;

public class sumandaverage {

	public static void main(String args[]) {
		int i, n=0,s=0;
		double avg;
		{
			System.out.println("input the 5 numbers");
		}
		for(i=0;i<5;i++)
		{
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			s+=n;
			
		}
		avg=s/5;
		System.out.println("the sum of nu:"+s+ "\n the avarage is:"+avg);

	}
}
		 



