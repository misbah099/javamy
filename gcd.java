package com.java;

import java.util.Scanner;

public class gcd {
	public static void main(String args[])
	{
	 
	 int n1,n2,i,gcd=0;
	 System.out.println("Enter the two num to find gcd=");
	 Scanner sc=new Scanner(System.in);
	 n1=sc.nextInt();
	 n2=sc.nextInt();
 for( i=1;i<=n1&&i<=n2;i++)
	 {
	if(n1%i==0&&n2%i==0) {
		gcd=i;
	}
	 }
 System.out.println("GCD of" +n1+ "and" +n2+ "is="+gcd);
	}
	}



