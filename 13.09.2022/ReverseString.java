/* WAP to input a string and check whether it is palindrome or not */
package Classfiles.java;

public class ReverseString {

	public static void main(String[] args) {
String str="mom";
 String reversestring="";
for(int i=str.length()-1;i>=0;i--) {
	reversestring+=str;
	if(str.equals(reversestring)) {
		System.out.println("plandrom");
		break;
	}
	else {
		System.out.println("not plandrom");

	}
}
	}

}
