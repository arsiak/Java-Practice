package com.arnaud;

import java.util.Scanner;

public class Ex3 {

	/**
	 * Write a program to divide two number and print the result on the screen
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nb1 = 0;
		int nb2 = 0;
		Scanner sc = new Scanner(System.in);
		boolean correctNumber = false;
		while(!correctNumber) {
			try {			
				System.out.println("Entrez le nombre à diviser: ");
				String enter = sc.nextLine();
				nb1 = Integer.parseInt(enter);
				correctNumber = true;
			}catch(NumberFormatException e) {
				continue;
			}
		}
		correctNumber = false;
		
		while(!correctNumber) {
			try {			
				System.out.println("Entrez le diviseur: ");
				String enter = sc.nextLine();
				nb2 = Integer.parseInt(enter);
				correctNumber = true;
			}catch(NumberFormatException e) {
				continue;
			}
		}
		System.out.println("Le résultat de la division est : " + nb1 / nb2);

	}

}
