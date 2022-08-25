package app2.java;

import java.util.Scanner;

public class mulwithoutoprator {
	public static void main(String args[])
	{
	 
	 int n1,n2,sum=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the 1st num=");
 n1=sc.nextInt();
 System.out.println("Enter the 2nd num=");
 n2=sc.nextInt();
 for(int i=1;i<=n1;i++) {
	 sum=sum+n2;
 }
 System.out.println("Multiplication of"+n1+"and"+n2+"is="+sum);
	}
}
