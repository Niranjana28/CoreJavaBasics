package com.basicSamples;

public class Unary_Operator {

	public static void main(String[] args) {
	     int a=12, b=12;
	     int result1,result3;
	     System.out.println("A value : "+ a);
	     //increment
	     result1=++a;
	     int result2=a++;
	     System.out.println("After pre Increment: "+ result1);
	     System.out.println("After post Increment: "+ result2);
	     
	     System.out.println("Value of b: "+ b);
	     //decrement
	     result3=--b;
	     int result4=b++;
	     System.out.println("After pre  Decrement: "+result3);
	     System.out.println("After  post Decrement: "+result4);
	     

	}

}
