package com.arnaud;

import java.util.Scanner;

public class Ex5 {

	/**
	 * Write a Java program that takes two numbers as input and display the product of two numbers. 
	 * Test Data:
	 * Input first number: 25
	 * Input second number: 5
	 */
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int nb1 = askValidInteger(sc);
		int nb2 = askValidInteger(sc);
		System.out.println("Résult: " + nb1 + "x" + nb2 + "=" + (nb1*nb2));

	}
	
	public static int askValidInteger(Scanner sc) {
		boolean validInteger = false;
		int nb1 = 0;
		while(!validInteger) {
			try{ 
				System.out.println("Enter a number to multiply:");
				String line1 = sc.nextLine();
				nb1 = Integer.parseInt(line1);
				validInteger = true;
			}catch(NumberFormatException e) {
				System.out.println("Can't be converted into integer");
				continue;
			}
		}
		return nb1;
	}

}
