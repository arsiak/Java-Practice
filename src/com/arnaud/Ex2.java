package com.arnaud;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

	/**
	 * Write a Java program to print the sum of two numbers
	 */
	
	public static void main(String[] args) {
		int nb1 = repeatTillGetNumber();
		int nb2 = repeatTillGetNumber();
		int sum = nb1 + nb2;
		System.out.println("La somme est de : " + sum);
	}
	
	/**
	 * Loop to get a number from user input
	 * @return valid number
	 */
	public static int repeatTillGetNumber(){
		Scanner sc = new Scanner(System.in);
		boolean correctNumber = false;
		int number = 0;
		while (!correctNumber) {
            System.out.println("Enter a whole number:");
            String input = sc.next();
            try {
                number = Integer.parseInt(input);
                correctNumber = true;
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a number, try again");
                continue;
            }
            System.out.println("Ok");
        }
		return number;
	}

}
