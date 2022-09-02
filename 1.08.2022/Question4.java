/*Write a program to define a class Item containing code and price.
 *  Accept this data for five objects using array of objects. Display code, price in tabular form and also, 
 *  display total price of all items.8/
 */
package pack.java;

import java.util.Scanner;

public class Question4 {
		String code;
		int price;
		Question4(String c, int p){
			code=c;
			price=p;
		}
		
		public static void main(String args[]) {
			Question4[] A=new Question4[5];
			String a;
			Scanner sc=new Scanner(System.in);
			int b,Total_Cost=0;
			
			for(int i=0;i<5;i++) {
				System.out.println("Enter item code: "+(i+1));
				a=sc.nextLine();
				System.out.println("Enter item price: "+(i+1));
				b=sc.nextInt();
				A[i]=new Question4(a,b);
			}
			System.out.println("item code & item price");
			System.out.println(" ");
			for(int i=0;i<5;i++) {
				 System.out.print(A[i].code);
			      System.out.println(A[i].price);
			      Total_Cost = Total_Cost + A[i].price;
			    }
			    System.out.print("Total Price = "+Total_Cost);
			
	 	}

}
