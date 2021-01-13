package com.learning.java;

import java.util.Scanner;

public class SpecialCharAsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String value:");
		String var = sc.nextLine();

		int count = 0;

		for (int i = 0; i < var.length(); i++) {
			if (var.charAt(i) == '(' && i != var.length() - 1) {
				if (var.charAt(i + 1) == ')') {

				} else {
					System.out.println("String is not valid");
					count++;
					break;
				}
			} else if (var.charAt(i) == '{' && i != var.length() - 1) {
				if (var.charAt(i + 1) == '}') {

				} else {
					System.out.println("String is not valid");
					count++;
					break;
				}
			} else if (var.charAt(i) == '[' && i != var.length() - 1) {
				if (var.charAt(i + 1) == ']') {

				} else {
					System.out.println("String is not valid");
					count++;
					break;
				}

			} /*
				 * else if (var.charAt(i) == ')' && i % 2 != 0) { if (var.charAt(i - 1) == '(')
				 * {
				 * 
				 * } else { System.out.println("String is not valid"); count++; break; } }
				 * 
				 * else if (var.charAt(i) == '}' && i % 2 != 0) { if (var.charAt(i - 1) == '{')
				 * {
				 * 
				 * } else { System.out.println("String is not valid"); count++; break; } } else
				 * if (var.charAt(i) == ']' && i % 2 != 0) { if (var.charAt(i - 1) == '[') {
				 * 
				 * } else { System.out.println("String is not valid"); count++; break; } }
				 */ else {
				System.out.println("String is not valid");
				count++;
				break;
			}
		}

		if (count == 0) {
			System.out.println("String is valid");
		}
	}

}
