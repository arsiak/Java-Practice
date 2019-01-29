package com.arnaud;
import java.util.Scanner;

public class Ex6 {

	/**
	 * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
	 * Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Afficher un nombre: ");
		int nb1 = sc.nextInt();
		System.out.println("Afficher le deuxième nombre: ");
		int nb2 = sc.nextInt();
		System.out.println("Le résultat de " + nb1 + " + " + nb2 + " = " + (nb1+nb2));
		System.out.println("Le résultat de " + nb1 + " - " + nb2 + " = " + (nb1-nb2));
		System.out.println("Le résultat de " + nb1 + " x " + nb2 + " = " + (nb1*nb2));
		System.out.println("Le résultat de " + nb1 + " / " + nb2 + " = " + (nb1/nb2));
		System.out.println("Le résultat de " + nb1 + " mod " + nb2 + " = " + (nb1%nb2));
		
	}

}
