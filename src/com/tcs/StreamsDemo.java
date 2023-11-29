package com.tcs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Integer> arlist= new ArrayList<Integer>();
		arlist.add(15);
		arlist.add(25);
		arlist.add(5);
		
		// Using Streams
//		List<Integer> filtered= new ArrayList<Integer>();
//		filtered=arlist.stream().filter(x-> x>=15).collect(Collectors.toList());
//		filtered.stream().forEach(x->System.out.println("------With Streams------------"+x));
		

//		//With out Streams
//		List<Integer> arlistfromMethod = findElements(arlist);
//		for (Integer i : arlistfromMethod) {
//			System.out.println("-----With out Streams-----------"+i);
//		}
	}

	
	public static List<Integer> findElements(List<Integer> arlist){
		
		List<Integer> filered= new ArrayList<Integer>();
		
		for (Integer integer : arlist) {
			if (integer >=15) {
				filered.add(integer);
			}
		}		
		return filered;
	}

	
	
}	


