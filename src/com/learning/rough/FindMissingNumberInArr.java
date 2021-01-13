package com.learning.rough;

public class FindMissingNumberInArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_num,expected_num_sum;
		 int num_sum = 0;
		   int[] numbers = new int[]{1,2,3,4,6,7,8,9,10,11};
		   total_num =11;
		   if(total_num%2==0) {
			   expected_num_sum = (total_num+1) * (total_num  / 2);
		   }
		   else {
		    expected_num_sum = total_num * ((total_num + 1) / 2);
		   }
		  
		   for (int i: numbers) {
		    num_sum += i;
		    
		    
	}
		   System.out.println(expected_num_sum);
		   System.out.println(num_sum);
		   System.out.print( expected_num_sum - num_sum);
		   System.out.print("\n");

}
	
}
