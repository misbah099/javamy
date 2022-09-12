/* Write a program to throw a user-defined exception "String Mismatch Exception"
 * , if two strings are not equal (ignore the case). */
package Classfiles.java;

import java.util.Scanner;

public class MissmatchStringmain {
	public static void main(String args[]) throws StringMisMatchException {
		Scanner sc= new Scanner(System.in);
String str="misba123";
System.out.println(str);
System.out.print("Enter the  String same as above:");
String cp=sc.next();
	try {
		if (str.equalsIgnoreCase(cp)) {
			System.out.println("the entered string is  equal to the given string");
		}else {
			throw new  StringMisMatchException("the entered string is not equal to the given string");
		}
		
	} catch ( StringMisMatchException e) {
		System.out.println(e.getMessage());
	}
}
}

