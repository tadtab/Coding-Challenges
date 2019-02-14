package com.tadtab.coreJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeletingOperation {

	public static void main(String[] args) {
		System.out.println(reduceString("aaabccddd"));
	}
	
	static int reduceString(String s) 
		{ 
		
		int l = s.length();
		int count = 1, steps = 0; 
		
		// traverse in the string 
		for (int i = 1; i < l; i++) 
		{ 
		// if adjacent characters  
		// are same 
		if (s.charAt(i) == s.charAt(i - 1)) 
		count += 1; 
		
		else
		{ 
		// if same adjacent pairs  
		// are more than 1 
		steps += (count / 2); 
		
		count = 1; 
		} 
		} 
		steps += count / 2; 
		return steps; 
		} 
}
