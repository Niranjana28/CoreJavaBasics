package com.ClassesAndObjects;

public class ArraySample {

	public static void main(String[] args) {
		//declare and initialize and array
		int[] age= {12,4,5,2,5};
		
		// access eacg array elements
		System.out.println("Accessing Elements of Array:");
		System.out.println("First Element: "+age[0]);
		System.out.println("Second Element: "+age[1]);
		System.out.println("Third Element: "+age[2]);
		System.out.println("Forth Element: "+age[3]);
		System.out.println("Fifth Element: "+age[4]);
		
		//loop through the array
		//using for loop
		System.out.println("Using for loop: ");
		for(int i=0; i<age.length; i++) {
			System.out.println(age[i]);
		}
		
		//loop through the array
		//using for loop
		System.out.println("Using for-each loop: ");
		for(int a:age) {
			System.out.println(a);
		}
		
		//access all elements using for each loop
		int []numbers= {2, -9,0,5,12,-25,22,9,8,12};
		int sum=0;
		Double average;
		//add each elements in sum
		for(int number: numbers) {
			sum += number;
		}
		
		//get the total number of elements
		int arrayLength = numbers.length;
		
		//calculate the average
		//covert the average from int to double
		average = ((double)sum/(double)arrayLength);
		
		System.out.println("Sum = " + sum);
		System.out.println("Average = "+ average);
		
		//create a 2nd array
		int[][] a= {
				{1,2,3},
				{4,5,6,9},
				{7},
		};
		
		//calculate the length of the each row
		System.out.println("Length of row 1: "+ a[0].length);
		System.out.println("Length of row 2: "+ a[1].length);
		System.out.println("Length of row 3: "+ a[2].length);
		
			
		}
		
}


