package com.tadtab.HereAndThere;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringOperation {
	
	
	public static void main(String[] str) {
		getFirstOccurance("Hello ooooo");
	}
	



	static void getFirstOccurance(String str) {
		Map<Character, Integer> charMap = new HashMap<>();
		char[] charArray = str.toCharArray();
		
		for(int i = 0; i < charArray.length; i++) {
			if(charMap.containsKey(charArray[i])) {
				System.out.println(charArray[i]);
			}
			
			charMap.put(charArray[i], i);
		}
		
		Iterator<Entry<Character, Integer>> iterator = charMap.entrySet().iterator();
		System.out.println(charMap.entrySet());
		
		while(iterator.hasNext()) {
			Entry<Character, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
