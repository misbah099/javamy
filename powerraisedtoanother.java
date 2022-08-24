package com.java;

import java.util.Scanner;

public class powerraisedtoanother {
	public static void main(String args[])
	{
	 
	 int base,exponent,result=1;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the base num");
 base=sc.nextInt();
 System.out.println("Enter the Exponent num");
 exponent=sc.nextInt();

 for( int i=1;i<=exponent;i++) {
	 result=result*base;
	 
 }

System.out.print("the result is="+result);
	 
	}
}


