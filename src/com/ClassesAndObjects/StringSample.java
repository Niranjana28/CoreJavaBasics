package com.ClassesAndObjects;

public class StringSample {

	public static void main(String[] args) {
		
		//create a strings
		//String type="Java Programming";
		String first="Java is a Object oriented Programming ";
		String second=" Python";
		String third=" Language";
		
		//print strings
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		//Length of the string
		System.out.println("Length of the string : "+first.length());
		
		//concat two strings
		String joinedString = first.concat(third);
		System.out.println("Joined String is "+joinedString);
		
		//compare two strings
		first ="Java Programming"; 
		second="Java Programming";
	    third="Python Programming";
		
	    //compare first and second strings
	    boolean result1=first.equals(second);
	    System.out.println("string first and second are equal: "+result1);
	    
	   //compare first and third strings
	    boolean result2=first.equals(third);
	    System.out.println("string first and third are equal: "+result2);
	    
	    String example="Hello";
	    example = example.concat("Welcome");
	    
	  }

}
