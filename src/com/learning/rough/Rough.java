package com.learning.rough;

public class Rough {
	
	public static void main(String[] args) {
		
		int[] a = {5,4,3,2,1};
		
		int[] b = new int[a.length-1];
		System.out.println("leanght is:"+a.length);
		for(int i=0;i<=a.length-2;i++) {
			b[i] = a[i]-a[i+1];
		}
		System.out.print("the new array values are :{");

		for(int i=0;i<b.length;i++) {
		System.out.print(","+b[i]);ss
	}

}
}
