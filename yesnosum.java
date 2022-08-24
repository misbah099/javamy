package com.java;

import java.util.Scanner;

public class yesnosum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		char op;
		do {
			System.out.println("Enter two numbers you want to add");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			sum=n1+n2;
			System.out.println("Do you want to find sum? type Y for-yes-N for -No-");
            op=sc.next().charAt(0);
    		System.out.println("sum="+sum);

		}	
		while(op=='Y'||op=='y');
	}
	}

