package com.ClassesAndObjects;

public class BicycleDriver {

	public static void main(String[] args) {
     Bicycle sportsCycle=new Bicycle();
     System.out.println("No.of gear in sport cycle is "+sportsCycle);
     sportsCycle.braking();

     Bicycle touringCycle=new Bicycle(6,true);
     System.out.println("No.of gear in touring cycle is "+touringCycle);
     touringCycle.braking();
	}

}
