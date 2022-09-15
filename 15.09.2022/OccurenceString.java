/* Write a program to find the first and the last occurence of the letter 'o'  in 
 * "Hello World". */
package Classfiles.java;

import java.util.Scanner;

public class OccurenceString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); {
			
			
			String s="Hello, world";
			int count1=0,count2=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='o') {
					count1=i;
					break;
				}
			}
			
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='o') {
					count2=i;
				}
			}
			System.out.println(count1+" "+count2);
					
	}
		
}
	
	}


