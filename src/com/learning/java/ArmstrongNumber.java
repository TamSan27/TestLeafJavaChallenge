package com.learning.java;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int r,n,sum;
        System.out.println("Armstrong numbers are:");
		for(int i=0;i<=200;i++) {
			if(i==0) {
				System.out.println(i);
			}else if(i==1) {
				System.out.println(i);
			}else {
				n=i;
				sum=0;
				while(n>0) {
					r=n%10;
					sum = sum+(r*r*r);
					n=n/10;
				}
				if(i==sum) {
					System.out.println(i);
				}
			}
			
		}
	
		
	}

}
