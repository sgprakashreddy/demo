package com.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedChar {

	public static void main(String[] args) {

		String str = "Student Technique";
		
		Map<Character, Long> check = str
				.chars()
				.mapToObj(e->(char)e)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
		
		Optional<Character> nonrepepeated = check.entrySet()
		.stream()
		.filter(e ->e.getValue()>1) // repeated character >1  non repeated character==1
		.map(t -> t.getKey()).findFirst();
		
		System.out.println(" Non repeated character "+nonrepepeated.get());
		
	}

}
