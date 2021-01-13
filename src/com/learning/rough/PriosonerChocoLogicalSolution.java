package com.learning.rough;

import java.util.Scanner;

public class PriosonerChocoLogicalSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int totalCandies, totalPriosoner, c, startPosition, e, f;
		System.out.println("Enter total candies:");
		totalCandies = sc.nextInt();
		System.out.println("Enter total priosoner:");
		totalPriosoner = sc.nextInt();
		c = totalCandies % totalPriosoner;
		System.out.println("Enter Start position:");
		startPosition = sc.nextInt();
		if (startPosition <= totalPriosoner) {
			if (c == 0) {
				c = totalCandies / totalPriosoner;
				if (startPosition == 1) {
					System.out.println(totalPriosoner + " is the last prisoner");
				} else {
					f = startPosition - 1;
					System.out.println(f + " is the last prisoner");
				}
			} else {
				e = startPosition - 1;
				f = e + c;
				if (f > totalPriosoner) {
					f = f - totalPriosoner;
					System.out.println(f + " is the last prisoner");
				} else {
					System.out.println(f + " is the last prisoner");
				}
			}
		} else {
			System.out.println(startPosition + " value exceeds Prisoner total value");
		}

	}

}