/*WAP to input a string and reverse it without using any inbuilt method   */
package Classfiles.java;

public class RevString {

	public static void main(String[] args) {
		String str="Sachin";
		String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			System.out.println(rev);
	}

}
