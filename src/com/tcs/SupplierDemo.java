package com.tcs;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {

		SupplierDemo sdemo= new SupplierDemo();
		System.out.println(sdemo.fetchCurrentDemo());
		
		Supplier<Date> currentDate = () -> new Date();
		System.out.println(currentDate.get());
		
	}

	public Date fetchCurrentDemo() {
		return new Date();
	}

}
