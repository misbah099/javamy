package com.java;

public class prime15to30 {
public static void main(String args[])
{
	int j;
	for(int i=15;i<=30;i++) {
		for( j=2;j<i;j++) {
			if(i%j==0) {
			break;
			}
		}
		if(i==j) {
			System.out.println(j);
		}
	}
}
}
