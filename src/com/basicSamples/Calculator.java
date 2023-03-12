package com.basicSamples;
public class Calculator {
	int number;
	static int c;
	final double pi=3.14;
	public void add(int a, int b) {
	
		System.out.println("Value of a " + a++);
		System.out.println("Value of a " + b);
		System.out.println("Value of a " + ++a);
		System.out.println("Value of a " + --b);
		
		a=a+1;
		a+=1;
		
	
		int sum=a+b;
		System.out.println(sum);
	}
	
	public void area(double radius) {
		//pi=5.23;
		double area=pi*radius*radius;
		System.out.println("Area is "+ area);
	}

	public static void main(String[] args) {
		Calculator cobj=new Calculator();
		cobj.add(10,20);
		cobj.number=10;
		c=15;
		Calculator a1=new Calculator();
		a1.area(34.67);
	
  }
}