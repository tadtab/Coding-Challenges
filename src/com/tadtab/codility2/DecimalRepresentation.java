package com.tadtab.codility2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;;

public class DecimalRepresentation {

	public static void main(String[] args) {
		getIndex(354, 435435);
	}
	
	static int getIndex(Integer a, Integer xyz) {
		int index = -1;
		
		String[] intArray = xyz.toString().split("");
		int len = a.toString().length();
//		
//		IntStream.range(0, intArray.length)
//				.forEach(i -> {
//					String bSubString = intArray[i];
//					IntStream.range(1, len)
//						.filter(j -> {
//							return (i + j) < intArray.length;
//							})
//						
//						
//				});
			
		for(int i = 0; i < intArray.length; i++) {
				
				String bSubString = intArray[i];
				for(int j = 1; j < len; j++) {
					if(i + j < intArray.length) {
						bSubString += intArray[i + j];
					}
				}
				
					if(a.toString().equals(bSubString)) {
						
						index = i;
					
				}
		}
		
		
		
		return index;
	}

}
