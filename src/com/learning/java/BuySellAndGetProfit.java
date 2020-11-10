package com.learning.java;

import java.util.ArrayList;
import java.util.Scanner;

public class BuySellAndGetProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize, profit, value;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements you are going to provide as input:");
		arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		System.out.println("Enter the values of an array:");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		profit = 0;
		value = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					value = array[j] - array[i];
				}
				if (profit < value) {
					profit = value;
				}
			}
		}
		System.out.println("The profit is:" + profit);
	}

}
