package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JavaStreamAPIDemo {

	public static void main(String[] args) {

		List<String> names=Arrays.asList("Student Technique","java","mohan","soban","sharma","Burma","sharma");
		
		
		//Stream on list
//		names.stream().forEach((e)->System.out.println(e));
		
		//Distinct methodd
//		names.stream()
//			.distinct()
//			.forEach((i)->System.out.println(i));
		
		//filter the name
//		names.stream().filter(t -> t.startsWith("s"))  ////		.distinct()  // get the distinct values //		.forEach((k)-> System.out.println(k));
//	    .forEach(System.out::println);
		
		//any match for ravi
//		boolean test = names.stream().anyMatch(c->c.equalsIgnoreCase("ravi"));
//		System.out.println(test);
		
		//All match
//		boolean test2= names.stream().allMatch(t -> t.equals("ravi"));
//		System.out.println(test2);

		//print the count of names		
//		System.out.println(names.stream()
////				.distinct()
//				.count());;
		
		//Printing the length of each string in List
//		names.stream()
//		//.map(l->l.length())
//		.map(String::length)
//		.forEach(System.out::println);
		
		//sort by name
//		names.stream().sorted().distinct().forEach(System.out::println);

		//sort by name
//		names.stream().sorted().forEach(System.out::println);
		
		// filter the names on letter s and greater than 5
//		names.stream().filter(t -> t.startsWith("s"))
//		.filter( s->s.length()>4).forEach(System.out::println);
		
		// not using filter but you can use the Predicate function
//		Predicate<String> P1=t -> t.startsWith("S");
//		Predicate<String> P2= j-> j.length()>5;
//		names.stream().filter(P1.and(P2)).forEach(System.out::println);

		//I want only 2 records
//		names.stream().limit(2).forEach(System.out::println);
		
		// only last 3 records
		names.stream().skip(3)
		.distinct()
		.forEach(System.out::println);
	
	}

}
