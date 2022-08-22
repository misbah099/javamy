package com.java;

import java.util.Scanner;

public class tablemultiply {
public static void main(String args[])
{
 System.out.println("Enter the table number:");
 Scanner sc=new Scanner(System.in);
 int num=sc.nextInt();
 int i,m;
 for(i=0;i<=10;i++) {
	 m=num*i;
System.out.println(+i+"X"+num+"="+m) ;
 }
}
}
