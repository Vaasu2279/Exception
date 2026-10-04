package com.exception;

import java.util.Scanner;

public class ATM {
	static Scanner sc = new Scanner(System.in); 
	
		static void withdraw() {
			
			int amount =1000;
			System.out.println("enter the amount want to withdraw :");
			int withdraw = sc.nextInt();
			int balance = 0;
			if(withdraw >amount) {
				balance = amount-withdraw;
				throw new ArithmeticException("balance is insufficent");
			}
	
			System.out.println("remaing balancing is :"+balance);
		
	}

	public static void main(String[] args) {
		
		try {
			withdraw();
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("first one");
		}
		
		try {
			System.out.println("enter the amount you want withdraw ");
			String str = sc.next();
			double d = Double.parseDouble(str);
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
			System.out.println("second one ");
		}
		try {
			System.out.println("enter the number how many days transcation you want :");
			int n = sc.nextInt();
			int [] arr = new  int[5];
			System.out.println(arr[n]);
		}catch(ArrayIndexOutOfBoundsException aie) {
			aie.printStackTrace();
			System.out.println("third one");
		}
		
	}

}
