package com.java;

import java.util.Scanner;

public class factorial {
public static void main(String args[])
{
	System.out.println("Enter the number:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i,fac=1;
	for( i=1;i<=n;i++) {
		fac*=i;
	}
	System.out.println("factorial of the number="+fac);

}
}
