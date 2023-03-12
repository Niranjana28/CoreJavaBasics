package com.ClassesAndObjects;

public class KidDriver {

	public static void main(String[] args) {
		Kid kidOne = new Kid("pinky", 8);
		kidOne.play();
		Kid kidTwo = new Kid("Vicky", 8);
		//System.out.println(kidTwo.name);
		kidTwo.play();
		kidTwo.printKid("Pinky", 20);
		kidTwo.printKid(10);

	}

}
