package com.controlFlowSample;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=0 ; i<n; i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(c);
			sc.close();
		}
		
	}

}
