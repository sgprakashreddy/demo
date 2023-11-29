package com.tcs;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {

		Consumer<Integer> squareme= i -> System.out.println("------ SQUARE-------- "+i*i);
		squareme.accept(5);
		
		Consumer<Integer> doubleme= i -> System.out.println("------ DOUBLE------- "+2*i);
		doubleme.accept(5);
		
		squareme.andThen(doubleme).accept(3);
		
//		squareme.compose(doubleme).accept(3);  // There is no compose in Consumer
		
	}

}
