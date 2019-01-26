package com.arnaud;

import java.util.Scanner;
import java.util.regex.*;

public class Ex1 {
	
	private static Pattern pc;
    private static Matcher m;
    private final static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
	    String pattern = "\\d";
	    pc = Pattern.compile(pattern);
		String name = "";
		do {
			System.out.println("What's your name ?");
			name = sc.nextLine();
			m = pc.matcher(name);
			System.out.println();
		} while (name.trim().isEmpty() || m.find()); // Si l'utilisateur ne saisit rien ou que des espaces ou au moins un chiffre 
		System.out.println("Hello \n" + name);
	}
}
