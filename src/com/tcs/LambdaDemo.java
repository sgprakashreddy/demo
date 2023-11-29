package com.tcs;

import java.util.Comparator;
import java.util.function.BiConsumer;

public class LambdaDemo {

	public LambdaDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		LambdaDemo lambdaDemo = new LambdaDemo();
//		lambdaDemo.add(10,15);

		BiConsumer<Integer, Integer> biconsumer=(a,b)-> System.out.println(" Using the Lambda function  " +(a+b));
		biconsumer.accept(10, 15);
		
	  BiConsumer<Integer , Integer> bc = (i,j) -> System.out.println(i+j); bc.accept(10, 15);
	  BiConsumer<String , String> bc2 = (i,j) -> System.out.println(i.length()+j.length());  bc2.accept("10", "15");
	  
	  Comparator<String> c = (s1,s2) -> s1.compareTo(s2);
	  System.out.println(""+c);

		
	}

	public void add(Integer i, Integer j) {
		System.out.println(i+j);			
	}

}
