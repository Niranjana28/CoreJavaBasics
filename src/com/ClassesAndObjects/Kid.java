package com.ClassesAndObjects;

public class Kid {
	String name;
	int age;

        public Kid(String name, int age) {
			this.name=name;
			this.age=age;
		}
        public void play() {
        	System.out.println(this.name + " is playing..");
        }
        
        //Method Overloading
        public void printKid(String name) {
        	System.out.println("Name of the kid is : "+this.name+"andAge is: "+this.age);
        }
        public void printKid (int studying) {
        	System.out.println("kid is studying in :"+studying);
        }
        public void printKid (String name, int age) {
        	System.out.println("kid name is : "+name);
        }
        
       
        
}


