package com.tcs;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {

	FunctionDemo fdemo = new FunctionDemo();
	fdemo.squareintnumber(5);
	System.out.println("-----Square of the number -----"+fdemo.squareintnumber(5));


	Function<Integer, Integer> test = i -> i*i;
	System.out.println("-----Number to Squared--------- "+test.apply(6));
	
	}
	
	public int squareintnumber(int i) {
		return i*i;
	}

}
