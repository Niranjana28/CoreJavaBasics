package com.controlFlowSample;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size :");
		int size=sc.nextInt();
		int arr[]=new int[size];
		int max=arr[0];
		for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
		}
	    for(int i=0; i<size; i++) {
		  if(arr[i]>max)
		  {
			  max=arr[i];
		  }
	  }
	  System.out.println("Largest element in an array is "+ max);	
	  sc.close();

	}

}
