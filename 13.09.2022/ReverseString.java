/* WAP to input a string and check whether it is palindrome or not */
package Classfiles.java;

import java.util.Scanner;

public class plandromString {

	public static void main(String[] args) {
		String s1,temp,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String=");
		s1=sc.nextLine();
		temp=s1;
		for(int i=s1.length()-1;i>=0;i--) {
			rev+=s1.charAt(i);
		}
		if(rev.equals(temp)) {
			System.out.println("Pallindrome String");
		}
		else {
			System.out.println("Not a Pallindrome string");
		}

}
}
