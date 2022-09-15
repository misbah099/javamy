/*   Write a Java Program to Search a Particular Word in a String. */
package Classfiles.java;

public class SearchWord {

	public static void main(String[] args) {
		String str = "Hello this is java";
		for(int i=0;i<str.length();i++)
		{	      
			if(str.charAt(i)=='i') {
				System.out.println("Word found at ="+i);
				break;
				
				
			}
	   }
	}
}


