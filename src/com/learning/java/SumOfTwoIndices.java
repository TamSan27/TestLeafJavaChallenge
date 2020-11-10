package com.learning.java;

import java.util.Scanner;

public class SumOfTwoIndices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				int arraySize, target, sum;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no of elements you are going to provide as input:");
				arraySize = sc.nextInt();
				int array[] = new int[arraySize];
				System.out.println("Enter the values of an array:");
				for (int i = 0; i < arraySize; i++) {
					array[i] = sc.nextInt();
				}
				System.out.println("Enter the target number:");
				target = sc.nextInt();
				for (int j = 0; j < arraySize; j++) {
					if (array[j] < target) {
						for (int k = j + 1; k < arraySize; k++) {
							if (array[k] < target) {
								sum = array[j] + array[k];
								if (sum == target) {
									System.out.println("Output is:" + "[" + j + "," + k + "]");
								}

							}

						}

					}

				}
			}
		}

		//Second logic
	/*	package com.test.java;

		import java.util.Scanner;

		public class SumOfAnArrayForOneOutput {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				int arraySize,target,searchValue;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no of elements you are going to provide as input:");
				arraySize = sc.nextInt();
				int array[] = new int[arraySize];
				System.out.println("Enter the values of an array:");
				for (int i = 0; i < arraySize; i++) {
					array[i] = sc.nextInt();
				}
				System.out.println("Enter the target number:");
				target = sc.nextInt();

				for (int j = 0; j < arraySize; j++) {
					if (array[j] < target) {
						searchValue = target - array[j];
						for (int k = j + 1; k < arraySize; k++) {
							if (array[j] < target) {
								if (searchValue == array[k]) {
									System.out.println("Output is:" + "[" + j + "," + k + "]");
								}

							}

						}

					}

				}
			}
		}

		//second code
				int arraySize,target,searchValue;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the no of elements you are going to provide as input:");
				arraySize = sc.nextInt();
				int array[] = new int[arraySize];
				System.out.println("Enter the values of an array:");
				for (int i = 0; i < arraySize; i++) {
					array[i] = sc.nextInt();
				}
				System.out.println("Enter the target number:");
				target = sc.nextInt();

				for (int j = 0; j < arraySize; j++) {
					if (array[j] < target) {
						searchValue = target - array[j];
						for (int k = j + 1; k < arraySize; k++) {
							if (array[j] < target) {
								if (searchValue == array[k]) {
									System.out.println("Output is:" + "[" + j + "," + k + "]");
								}

							}

						}

					}

				}
			}
		}
	}

}*/
