package com.tcs;

public class MethodReferenceDemo {

	public MethodReferenceDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		FunctionalInterfaceDemo functionalInterfaceDemo=Test ::testImplemenation;
//		functionalInterfaceDemo.singelAbstractMethod();
		
		//if No implementation is available in existing code the use following code lambda expressions
		FunctionalInterfaceDemo f = () -> System.out.println("--IMPLEMENTATION OF Single Abstract Method----");
		f.singelAbstractMethod();
	}

}


class Test{
	
	public static void testImplemenation() {
		System.out.println("--This is the test implememtation of your Abstract method---");
	}
	
}
