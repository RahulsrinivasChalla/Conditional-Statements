package com.jfs.conditionalstatements;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		long a = sc.nextLong();
		
		if (a==0) {
			System.out.println(a + " is Zero");
		}
		else if(a%2==0) {
			System.out.println(a + " is Even Number");
		}
					
		else {
			System.out.println(a + " is Odd");
		}
		sc.close();
		}
	
}
