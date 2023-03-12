package com.CollectionSample;

import java.util.ArrayList;

import com.oopsSample.AuditStudent;
import com.oopsSample.CompanyStudent;
import com.oopsSample.PayingStudent;
import com.oopsSample.Student;

public class ArrayListSample {

	public static void main(String[] args) {
		//create ArrayList
		 ArrayList<Student> students=new ArrayList<>();
		 //Add elements to the arraylist
         Student s1=new PayingStudent("Peter", 9.5f);
	     Student s3=new PayingStudent("Vicky", 8.7f);
	     Student s2=new CompanyStudent("John", "Zuci");
	     Student s4=new CompanyStudent("Raj", "Zuci");
	     Student s5=new AuditStudent("Pinky", "Auditoriam");
		
		
	    students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		students.remove(s4);
		
	    System.out.println("ArrayList: "+ students);
	    students.remove(s3);
	    System.out.println("After removal Array List: "+ students);
		
		//To read element
		//System.out.println("Get elements.."+student.get(1));
		
		//To update element
		//student.set(2, "Daisy");
		//System.out.println(student);
		for(Student s:students) {
			System.out.println(s);
		}


	}

}
