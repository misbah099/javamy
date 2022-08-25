package app2.java;

import java.util.Scanner;

public class conditionvowelcons {
	public static void main(String args[])
	{
	 char ch;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the the char to  check vowel or constant=");
     ch=sc.next().charAt(0);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='e'||ch=='i') {
    	 System.out.println("Entered character is Vowel="+ch);

}
     else if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
    	 
    	 System.out.println("Entered character is consonant="+ch);
     }
    	 else {
        	 System.out.println("NOT A LETTER="+ch);

    	 }
    		 
     
     }
    	 
	}
