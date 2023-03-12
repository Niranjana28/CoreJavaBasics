package com.CollectionSample;

import com.oopsSample.AuditStudent;
import com.oopsSample.CompanyStudent;
import com.oopsSample.Student;

public class HashMap {
	public static void main(String[] args) {
		
		HashMap <Integer,Student> ID = new HashMap<>();
		Student s1=new AuditStudent("John", " Auditorium");
		Student s2=new CompanyStudent("Jessy", "Zuci");
		Student s3=new AuditStudent("Peter", "HolidayIn");
		Student s4=new AuditStudent("Wicky", " Auditorium");
		Student s5=new CompanyStudent("Pinky", "Zuci");
		
		//put method
		ID.put(101,s1);
		ID.put(102,s2);
		ID.put(103,s3);
		ID.put(104,s4);
		ID.put(105,s5);
		
		//Get method
		for(int i=101; i<=105; i++) {
			System.out.println(ID.get(i));
		}
		
		
	 }

}
