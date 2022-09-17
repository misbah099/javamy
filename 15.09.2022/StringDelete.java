/* WAP in java to delete All repeated word in String */
package Classfiles.java;

public class StringDelete {
	public static void main(String[]args)
	{
		String s="I want to go to Delhi";

	String r=" ";
	String[] words=s.split(" ");
	for (int i=0;i<words.length;i++) {
		for (int j=i+1;j<words.length;j++)
		{ if(words[i].equals(words[j])){
			words[j]="remove";
		}
	}
	}
	for(String w:words) {
		if(w!="remove") {
			r=r+w+" ";
			
}
	}
	System.out.println("The sentence after removing the duplicate words"+r);
	}
}
