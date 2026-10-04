package com.exception;

import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try{
			System.out.println("enter the string ");
			String str = sc.next();
			int str2 = Integer.parseInt(str);
		}catch(Exception e) {
			System.out.println(" first one");
			e.printStackTrace();
		}
		
		try {
			System.out.println("enter the number 1 :");
			int n1 = sc.nextInt();
			System.out.println("enter the number 2 :");
			int n2 = sc.nextInt();
			System.out.println(n1/n2);
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("second one ");
		}
		
		try {
		int[] arr = new int[5];
			
			arr[0]=1;
			arr[1]=1;
			arr[2]=1;
			arr[3]=1;
			arr[4]=1;
			System.out.println("enter the index value");
			int x = sc.nextInt();
		System.out.println(arr[x]);
  
	}catch(ArrayIndexOutOfBoundsException aie) {
		aie.printStackTrace();
		System.out.println("third one");
	}
		
	}

}
