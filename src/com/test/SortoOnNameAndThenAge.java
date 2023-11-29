package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortoOnNameAndThenAge {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Rashmika",32));
		persons.add(new Person("Pushpa",12));
		persons.add(new Person("Samantha",31));
		persons.add(new Person("Pushpa",56));
		
//		for (Person person : persons) {
//			System.out.println(person);
//		}
		
		//1 Using Collections Sort methods
		Collections.sort(persons, Comparator.comparing(Person::getName).thenComparing(Person::getAge));
		System.out.println(persons);

	
		//Sorted methods in Stream
		Comparator<Person> byName=(x,y) -> x.getName().compareTo(y.getName());
		Comparator<Person> byAge=(a,b) -> Integer.compare(b.getAge(), a.getAge());
		
		persons.stream()
		.sorted(byName.thenComparing(byAge))
		.forEach(System.out::println);
	}

}
