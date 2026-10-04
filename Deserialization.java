package com.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintWriter;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
		File f = new File("D:\\makedirectory\\makefile.txt");
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Cricket c = (Cricket)ois.readObject();
		
		PrintWriter pw = new PrintWriter("D:\\makedirectory\\makefile.txt");
		pw.println(c.no);
		pw.println(c.num);
		pw.println(c.str1);
		pw.println(c.str2);
		
		System.out.println("ended");
	}

}
