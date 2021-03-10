package com.learning.rough;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Rough {
	
	public static void main(String[] args) throws ParseException {
		
	/*	int[] a = {5,4,3,2,1};
		
		int[] b = new int[a.length-1];
		System.out.println("lenght is:"+a.length);
		for(int i=0;i<=a.length-2;i++) {
			b[i] = a[i]-a[i+1];
		}
		System.out.print("the new array values are :{");

		for(int i=0;i<b.length;i++) {
		System.out.print(","+b[i]);*/
		
		 DateFormat originalFormat = new SimpleDateFormat("yyyy-MM-dd");
		 Date date = originalFormat.parse("2021-02-19");
		 
		 
		 DateFormat targetFormat = new SimpleDateFormat("MMMM",Locale.ENGLISH);
		 
		 String formatDate = targetFormat.format(date);
		 int d = date.getDate();
		 int e;
		 
		 String dt = null;
		 System.out.println(d);
		 if(d>=11 && d<=13) {
			 dt = "th";
		 }else {
			 e = d%10;
			 System.out.println(e);
			 switch(e) {
			 case 1:
				dt = "st" ;
				break;
			 case 2:
				 dt = "nd";
				 break;
			 case 3:
				 dt = "rd";
				 break;
				 default:
					 dt = "th";
			
			 }
		 }
		
		 System.out.println("Converted date:"+formatDate+" "+d+dt);
		 
		 
	}

}
