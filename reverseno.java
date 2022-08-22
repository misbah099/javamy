package com.java;

import java.util.Scanner;

public class reverseno {
public static void main(String args[]) {
	int no,rev=0,r;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any num:");
	no=sc.nextInt();
	
	while(no>0) {
		r=no%10;
		rev=rev*10+r;
		no=no/10;
	
	}
	System.out.println("reverse of num is:"+rev);

}
}
