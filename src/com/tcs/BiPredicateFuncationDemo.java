package com.tcs;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateFuncationDemo {

	public static void main(String[] args) {

		BiPredicate<Integer,Integer> checksumof2 = (a,b) -> (a+b) >=5;
		System.out.println("sum of 2 and 5 is greater than -- " +checksumof2.test(2,5));
		System.out.println("sum of 2 and 1 is greater than -- " +checksumof2.test(2,1));
		
		BiFunction<Integer, Integer, Integer> multiplyboth = (a,b)-> a*b;
		System.out.println("Multiplication of 5 and 10 is -- " +multiplyboth.apply(5, 10));
		
		BiConsumer<Integer, Integer>  adding = (a,b)-> System.out.println(" -Adding --- BiConsumer " +(a+b));
		adding.accept(5, 2);
	}

}
