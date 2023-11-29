package com.tcs;

@FunctionalInterface
public interface FunctionalInterfaceDemo {

	void singelAbstractMethod();
//	void singelAbstractMethod2();
	
	
	default void printName() {
		
	}

	default void printName2() {
		
	}

	public static void teststatic() {
		System.out.println(" teststatic ");
	}
	
	public static void teststatic2() {
		System.out.println(" teststatic ");
	}
}
