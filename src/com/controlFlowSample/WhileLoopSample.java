package com.controlFlowSample;

import java.util.Scanner;

public class WhileLoopSample {

	public static void main(String[] args) {
		int sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a Number: "); 
		int number=input.nextInt();
		
		while(number>=0) {
			sum += number;
			System.out.println("Entera Number: ");
			number =input.nextInt();

	      }
		System.out.println("Sum = "+sum);
	}

}
