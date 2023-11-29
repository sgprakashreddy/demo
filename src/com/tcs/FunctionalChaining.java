package com.tcs;

import java.util.function.Function;

public class FunctionalChaining {

	public static void main(String[] args) {

		Function<Integer, Integer> doubleIt= i -> 2*i;
		System.out.println("---Double Function------" + doubleIt.apply(2));
		
		Function<Integer, Integer> cubeIt= i -> i*i*i;
		System.out.println("---Double Function------" + cubeIt.apply(3));
		
		System.out.println("---First Double Function and then Cube Function------" + doubleIt.andThen(cubeIt).apply(2));
		
		System.out.println("---First Cube fucntion and double function------" + doubleIt.compose(cubeIt).apply(2));
		
		
		
	}

}
