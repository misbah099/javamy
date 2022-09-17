/* WAP to read the data from two files and write it into another file */
package IO.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class ReadData {

	public static void main(String[] args) throws IOException {
		FileInputStream fin=new FileInputStream("test.txt");
		FileInputStream fin2=new FileInputStream("test2.txt");
		FileOutputStream fout=new FileOutputStream("test3.txt");

		SequenceInputStream inst=new SequenceInputStream(fin,fin2);
		int i;
		while((i=inst.read())!=-1) {
			fout.write(i);
		}
		inst.close();
		fin.close();
		fin2.close();
		fout.close();
		
	}

	}


