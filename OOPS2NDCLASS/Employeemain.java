/*Create a class called Employee having the following /atrributes: pan no,Name,Annual taxable income. Calculate the tax of an Employee according to the following criteria
and display all the information:
Annual taxable income upto 1,00,000 no tax
from 1,00,000 to 1,50,000 10% of income exceeding 1,00,000
from 1,50,001 to 5000+20% of income exceeding 1,50,000
above 2,50,000  25000+30% of income exceeding 2,50,000 */
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
