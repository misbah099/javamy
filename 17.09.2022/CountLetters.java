/*WAP to count the number of letters in a file  */
package IO.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountLetters {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fin=new FileInputStream("test.txt");
		int i=0,count = 0;
		while((i=fin.read())!=-1) { 
			if(i!=' ') {
			count++;}
		}
		System.out.print(count);

		fin.close();
			}

	}


