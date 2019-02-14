package com.tadtab.codility2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.IntStream;;

public class Codility2 {

	public static void main(String[] args) {
		
		int[] sampleArray = {10, 2, 3, 4, 5, 7};
		
		//getSmallestInt(sampleArray);
		
		System.out.println(getSmallestInt(sampleArray));
		
	}
	
	static int getSmallestInt(int[] A) {
		
		int lowesInteger = 1;
		
		Map<Integer, Integer> intMap = new HashMap<>();
		
		
		IntStream.range(0, A.length)
				.forEach(i -> intMap.put(i, A[i]));
		
		//IntStream.range(0, A.length).forEach(i -> System.out.println(intMap.get(i)));
		
		lowesInteger = IntStream.range(0, A.length).filter(i -> !intMap.containsValue(i + 1))
				.findFirst().getAsInt() + 1;
		
		
//		lowesInteger = Arrays.stream(asInt)
//				.filter(i -> !intMap.containsValue(1 + i))
//				.filter(Objects::nonNull)
//				.findFirst().getAsInt();
		
//		for(int i= 0; i< A.length; i++) {
//			
//			if(!intMap.containsValue(1 + i)) {
//				lowesInteger = i + 1;
//				break;
//			}else {
//				lowesInteger = 1;
//			}
//		}
//		
		return lowesInteger;
	}

}
