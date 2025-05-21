package com.jfs.conditionalstatements;

import java.util.Scanner;

public class ConditionalStatements {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER : ");
		int a = sc.nextInt();
				if (a<0) {
					System.out.println(a + " is negative");	
				}
				else if(a==0){
					System.out.println('a' + " is Zero");
				}
				else{
					System.out.println(a + " is postive");
				}
				sc.close();
	}

}
