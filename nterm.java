package com.java;

import java.util.Scanner;

public class nterm {
public static void main(String args[])
{
	int i,n,sum=0;
try (Scanner sc = new Scanner(System.in)) {
	System.out.println("enter the limit ");
	n =sc.nextInt();
}	
for(i=1;i<=n;i++) {
	System.out.println(i);

	sum+=i;
}
System.out.println("the natural numbers are uto"+n+ "terms:"+sum);
}
}