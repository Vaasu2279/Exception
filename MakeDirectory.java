package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MakeDirectory {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\makedirectory");
		
		boolean flag = f.mkdir();
		
		if(flag) {
			System.out.println("directory created sucessfully");
		}
		else {
			System.out.println("something went wrong");
		}
		
		File f1 = new File("D:\\makedirectory\\makefile.txt");
		
		try{
			 boolean status= f1.createNewFile();
		
		if(status) {
		System.out.println("file created sucessfully");
		}
		else {
			System.out.println("something went wrong");
		}
		
		try{FileReader f2 = new FileReader(f1);
		int n = f2.read();
		while(n>0) {
			System.out.print((char)n);
			n = f2.read();
		}
		
	  }catch(FileNotFoundException fe) {
		  fe.printStackTrace();
	  }
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
		System.out.println();
		System.out.println(f1.getCanonicalPath());
		System.out.println(f1.getAbsolutePath());
		System.out.println(f1.length());
		System.out.println(f1.canExecute());
		System.out.println(f1.canRead());
		System.out.println(f1.canWrite());
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		System.out.println(f1.getUsableSpace());
		
		File f3 = new File("D:\\java");
		
		String[] files = f3.list();
		
		for(String v:files) {
			System.out.println(v);
		}
		System.out.println(files.length);
	}
  }
