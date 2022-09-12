/* 2. Write a program to accept a password from the user and throw
 *  'Authentication Failure' exception if the password is incorrect. */
package Classfiles.java;

import java.util.Scanner;

public class AuthenticationMain {
	public static void main(String args[]) throws AuthenticationException {
		Scanner sc= new Scanner(System.in);
String passwrd="123";
System.out.print("Enter your password:");
String pswd=sc.next();
	try {
		if (passwrd.equals(pswd)) {
			System.out.println("Correct password");
		}else {
			throw new AuthenticationException("Incorrect password ");
		}
		
	} catch (AuthenticationException e) {
		System.out.println(e.getMessage());
	}
}
}


