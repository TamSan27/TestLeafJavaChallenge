package com.learning.rough;

import java.util.Scanner;

public class ArrayWithIntOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	// to get the array values in run time	
		int a[],n=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the total array:");
		n= scan.nextInt();
		a = new int[n];
		System.out.println("Enter the array value:");
		for(int i=0;i<n;i++) {
			a[i]= scan.nextInt();
		}
		System.out.println("Array values are:");
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}
		
		//to print only the integers
		String[] s = {"123","123"};
		
		for(int i=0;i<s.length;i++) {
			if(s[i]=="") {
				
			}
		}
		
		
		
		
		
	}

}
