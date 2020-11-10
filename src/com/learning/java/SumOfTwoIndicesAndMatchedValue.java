package com.learning.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfTwoIndicesAndMatchedValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arraySize, target, sum, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements you are going to provide as input:");
		arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		ArrayList<Integer> arrr;
		List<ArrayList<Integer>> arrrr = new ArrayList<ArrayList<Integer>>();

		System.out.println("Enter the values of an array:");
		for (int i = 0; i < arraySize; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the target number:");
		target = sc.nextInt();
		for (int j = 0; j < arraySize; j++) {
			if (array[j] == target) {
				count++;
				arrr = new ArrayList<Integer>();
				arrr.add(j);
				arrrr.add(arrr);
			} else {
				for (int k = j + 1; k < arraySize; k++) {
					if (array[k] < target) {
						sum = array[j] + array[k];
						if (sum == target) {
							count++;
							arrr = new ArrayList<Integer>();
							arrr.add(j);
							arrr.add(k);
							arrrr.add(arrr);
						}

					}

				}

			}

		}
		if (count == 0) {
			System.out.println("No index or sum of indices are matching with the target value");
		} else {

			System.out.println("Output count is:" + count);
			System.out.println("ArrayList new values are :" + arrrr);
		}
	}
}
