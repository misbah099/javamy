package app2.java;

import java.util.Scanner;

public class testnum25 {
	public static void main(String args[])
	{
		int result=0;
		Scanner sc=new Scanner(System.in);
  System.out.println("Enter the num you want to check=");
	int num=sc.nextInt();
	  System.out.println("Enter the 1st num=");
	  int a=sc.nextInt();
	  System.out.println("Enter the 2nd num=");
	  int b=sc.nextInt();
	  result=a*a+b*b;
		if(num==result) {
	
   System.out.println("num  is Sum of square of a^2+b^2="+result);
		}
		else {
			   System.out.println("num  is not Sum of square of a^2+b^2="+result);

		}
	}
}
