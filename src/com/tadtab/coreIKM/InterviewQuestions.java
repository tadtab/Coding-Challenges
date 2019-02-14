package com.tadtab.coreIKM;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

 class InterviewQuestions {
	
	static List<Person> people = Arrays.asList(new Person("Bob", 1), new Person(2), new Person("Jane", 3));
	
	static int x;
	public static void main(String[] args) {
		List<String> letters = new ArrayList(Arrays.asList("D", "B", "A", "C", "F", "G"));
		Predicate<String> p1 = s -> s.compareTo("C") > 0;
		Predicate<String> p2 = s -> s.equals("B");
		letters.removeIf((p2));
		System.out.println(letters);
	}

}

class Person {
	String name;
	Integer id;
	Person(String n, Integer i){
		name=n;
		id=1;
	}
	
	Person (Integer i){
		name=null;
		id=i;
	}
}

