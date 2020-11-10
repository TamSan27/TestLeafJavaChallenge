package com.learning.java;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int Count = 0, j = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				++Count;
			}
		}
		char ch[] = new char[str.length() - Count];
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != 'a' & str.charAt(i) != 'e' & str.charAt(i) != 'i' & str.charAt(i) != 'o'
					& str.charAt(i) != 'u' & str.charAt(i) != 'A' & str.charAt(i) != 'E' & str.charAt(i) != 'I'
					& str.charAt(i) != 'O' & str.charAt(i) != 'U') {
				ch[j] = str.charAt(i);
				j++;
			}

		}
		str = new String(ch);

		System.out.println("Output:" + str);

	}

}
