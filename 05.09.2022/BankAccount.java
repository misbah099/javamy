/*  Write a Java Program to Create Account with 500 Rs Minimum Balance
Create  a Class Called LessBalanceException Which returns the Statement that
 Says WithDraw Amount(_Rs) is Not Valid if the amount withdrawn is more than the balance.*/

package oopjava.java;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) { 
		int am=500;
		System.out.println("Account created with initial balance 500");
		int x=0;
		Scanner sc=new Scanner(System.in); 
		while(x!=1)
		{
		System.out.println("1. Diposit"); 
		System.out.println("2. Withdraw"); 
		int a=sc.nextInt();
		if(a==1)
		{
		System.out.println("Enter the ammount"); 
		int z=sc.nextInt();
		am+=z;
		System.out.println("Current balance :"+am);
		}
		else if(a==2)
		{
		System.out.println("Enter the ammount");
		int z=sc.nextInt(); 
		if(z>am)
		try {
		throw new LessbalanceException(z);
		} catch (LessbalanceException e) { 
		System.out.println(e.getMessage());
		
		}
		else
		am-=z;
		System.out.println("Current balance :"+am);
		}
		else {
			x=1;
		}
}
}

}

