package com.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {

	public static void main(String[] args) {

		List<Integer> arlist= new ArrayList<Integer>();
		arlist.add(15);
		arlist.add(25);
		arlist.add(52);
		
//		Stream<Integer> s = arlist.stream().filter(i->i%2==0);
//		s.forEach(x->System.out.println("----Even elements----------"+x));
		
		// merge above 2 lines to single line
		arlist.stream().filter(i->i%2==0).forEach(x->System.out.println("------EVEN Values---------"+x));
		
		// merge above 2 lines to single line
//		Stream s2= arlist.stream().map(i->i*i);
//		s2.forEach(x->System.out.println(x));
		
		// merge above 2 lines to single line
		arlist.stream().map(i->i*i).forEach(x->System.out.println("----SQUARED values-------"+x));;
		
		
	}

}
