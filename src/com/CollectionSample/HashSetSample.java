package com.CollectionSample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetSample {

	public static void main(String[] args) {
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(4);
		evenNumbers.add(2);
		evenNumbers.add(8);
		evenNumbers.add(6);
		evenNumbers.add(8);
		System.out.println("HashSet is " + evenNumbers);
		HashSet<Integer> numbers= new HashSet<>();
		//numbers.addA11(evenNumbers);
		numbers.add(5);
		numbers.add(8);
		System.out.println("New HashSet no is : "+ numbers);
		
		Iterator<Integer> iterate = evenNumbers.iterator();
		System.out.println("Hashmap using iterator : " );
		while(iterate.hasNext()) {
			System.out.print(iterate.next());
			System.out.print(", ");
		}
		boolean value1=numbers.remove(5);
		System.out.println("\n 5 removed? "+value1);
		
		boolean value2=numbers.removeAll(numbers);
		System.out.println("all elements removed "+value2);
		
		TreeSet<String> empList1 = new TreeSet<>();
		empList1.add("John");
		empList1.add("Peter");
		empList1.add("Andrew");
		System.out.println("List of employees : "+empList1);
	}
}
