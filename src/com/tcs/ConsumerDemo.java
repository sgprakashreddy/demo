package com.tcs;

import java.util.function.Consumer;

public class ConsumerDemo {


	public static void main(String args[]) {
		
		ConsumerDemo cdemo=  new ConsumerDemo();
		cdemo.squareIt(5);
		
		Consumer<Integer> squaremee= i -> System.out.println("----Taking input and performming the operations ------ " +i*i);
		squaremee.accept(5);
				
	}

	public void squareIt(int i) {

		int squared = i*i;
		System.out.println("----Squared number is------"+squared);				
	}
	
	
}
