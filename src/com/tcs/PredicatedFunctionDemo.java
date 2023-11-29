package com.tcs;

import java.util.function.Predicate;

public class PredicatedFunctionDemo {

	public static void main(String[] args) {

//		PredicatedFunctionDemo pdemo = new PredicatedFunctionDemo();
//		System.out.println("------------"+pdemo.testStringLength("code"));
		
		Predicate<String> testlength=st -> st.length()>=5;
		System.err.println("Length of the String is "+testlength.test("Javatechie"));
		
		Predicate<String> evenlength=st -> st.length() %2 == 0;
		System.err.println("EVEN Length of the String is "+evenlength.test("coddecode"));
		
		System.out.println("------MERGING with AND -----------" + testlength.and(evenlength).test("javatechieasdf"));
		System.out.println("------MERGING with OR -----------" + testlength.or(evenlength).test("javatechiesdfdgdf"));
		System.out.println("------MERGING with NEGATE -----------" + testlength.negate().test("javatechie"));
	}

//	private boolean testStringLength(String string) {
//		
//		boolean condition =string.length() >= 5;
////		boolean result= string.length() >= 5 ? true : false;
////		System.err.println("***********"+result);
////		return result;
//		
//		if(condition) {
//			return true;
//		}else		
//		return false;
//	}

}
