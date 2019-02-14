package com.tadtab.codility2;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class WordMachine {

	public static void main(String[] args) {
		System.out.println(solution("13 DUP 4 POP 5 DUP + DUP + -"));
	}

	static int solution(String str) {

		int finalResult = -1;

		Stack<Integer> integerStack = new Stack<>();

		String[] operationList = str.split(" ");
		
		try {
			Arrays.stream(operationList)
				.forEach(operation -> {
					if(("POP").equalsIgnoreCase(operation)) {
	
						integerStack.pop();
	
					} else if (("DUP").equalsIgnoreCase(operation)) {
	
						int top = integerStack.peek();
						integerStack.push(top);
	
					} else if (("+").equalsIgnoreCase(operation)) {
	
						int top1 = integerStack.pop();
						int top2 = integerStack.pop();
	
						int sum = top1 + top2;
						integerStack.push(sum);
	
					} else if (("-").equalsIgnoreCase(operation)) {
	
						int top1 = integerStack.pop();
						int top2 = integerStack.pop();
	
						int difference = top1 - top2;
						integerStack.push(difference);
	
					} else {
	
						integerStack.push(Integer.parseInt(operation));
					}
				});


			finalResult = integerStack.pop();
		} catch (EmptyStackException e) {
			finalResult = -1;
		}

		return finalResult;
	}

}
