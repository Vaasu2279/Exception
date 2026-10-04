package com.exception;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Buffer {

	//filereader 
	//filewriter
	//buffered reader we used bufferrd reader for more efficient
	//buffered writer
	//printwriter we used for more efficient 
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("C:\\java\\123.txt");
		
		fw.write(152);
		fw.write('v');
		fw.write('\n');
		fw.write('a');
		fw.write('\n');
		fw.write('s');
		fw.write('\n');
		fw.write('u');
		fw.write('\n');
		
		
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("vasu is good boy ");
		bw.flush();
		System.out.println("main method");
		
		FileReader fr  = new FileReader("C:\\java\\123.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}
		
		PrintWriter pw = new PrintWriter("C:\\java\\123.txt");
		pw.println(123456);
		pw.println("xyz");
		pw.flush();
		
	}
}
