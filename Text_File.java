package com.exception;
import java.io.*;

public class Text_File {

	public static void main(String[] args)   {
		
     File f = new File("C:\\java\\x.txt");
		
		try {
			f.createNewFile();
			
		try {
			FileReader fee = new FileReader(f);
			int n = fee.read();
			while(n>1) {
				System.out.print((char)n);
				n = fee.read();
			}
			System.out.println("file read sucessfully ");
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		}catch(IOException fe ) {
			fe.printStackTrace();
			System.out.println("file not create sucessfully ");
		}
		
   }
}
