package com.exception;

import java.io.*;

class Cricket implements Serializable{
	
	String str1 = "dhoni";
	String str2 = "kl rahul";
	transient int num = 123;
	int no= 4;
	
}

public class Serialization {

	public static void main(String[] args) throws IOException {
			
		Cricket c = new Cricket();
		
		File f = new File("D:\\makedirectory\\makefile.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		ois.writeObject(c);
	}

}
