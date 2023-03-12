package com.basicSamples;

import java.util.Scanner;

public class ConsoleInSample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//integer
		System.out.println("Enter an integer: ");
		int n=sc.nextInt();
		System.out.println("Entered num " + n);
		
		//float
		System.out.println("Enter a foalt");
		float f=sc.nextFloat();
		System.out.println("Entered num " + f);
		
		//double
		System.out.println("Enter a double: ");
		double d=sc.nextDouble();
	    System.out.println("Entered num: " + d);
	    
	    //String
	    System.out.println("Enter a string: ");
	    String s =sc.next();
	    System.out.println("Entered string : "+s);
	    
	    //long
	    System.out.println("Enter a long: ");
	    Long l =sc.nextLong();
	    System.out.println("Entered long : "+l);
	    
		
sc.close();
	}

}
