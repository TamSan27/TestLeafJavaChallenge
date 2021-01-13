package com.learning.rough;

public class CharOccurWOutMap {

	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		final int max_char=256;
	//	Scanner scan = new Scanner(System.in);
		String str="santhosh";
		
		
		
			int[] count = new int[max_char];
			

			/* This array holds the occurrence of each char, For example
			 * ASCII value of A is 65 so if A is found twice then 
			 * counter[65] would have the value 2, here 65 is the ASCII value
			 * of A
			 */
			int len=str.length();
			
			for(int k=0;k<len;k++)
				 count[str.charAt(k)]++;      
				 
				
			char[] ch = new char[str.length()];
			for(int i=0;i<len;i++)
			{
				ch[i]=str.charAt(i);
				
				// this Find logic is to print the letter counts only once.
				//If it is not there, we may print all the char even if it is duplicate
				int find=0;
				for(int j=0;j<=i;j++)
				{
					if(str.charAt(i)==ch[j])
							find++;
				}
				if(find==1)
				{
					System.out.println("the string ocurrence " + str.charAt(i)+" is "+ count[str.charAt(i)]);
					
			
				
				}
		
	}
	
}
}


