package oopjava.java;

import java.util.Scanner;

public class Employeemain {
	public static void main(String args[]) {
		int Epanno,Eincome;
		String Ename;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Pan num,Name and income of Employee");
		Epanno=sc.nextInt();
		Ename=sc.nextLine();
		Eincome=sc.nextInt();
		Employee e=new Employee(Epanno,Ename,Eincome);
		System.out.println("Payable tax on income"+e.getTax());

	}
	}
