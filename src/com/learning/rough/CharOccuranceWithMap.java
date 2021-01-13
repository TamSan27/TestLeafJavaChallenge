package com.learning.rough;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str ="Programming";
		Map<Character,Integer> map= new HashMap<>();
		
		char[] strArray = str.toCharArray(); 
		for(Character c :strArray)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
			map.put(c, 1);
			}
		}
		
		 for (Map.Entry entry : map.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
		
	}

}
