package com.oopsSample;

public class AuditStudent extends Student {
	String companyName;
	String classLocation;
	public AuditStudent(String name, String classLocation) {
		this.name=name;
		this.classLocation = classLocation;
		
	}
	public void gotoClass() {
		System.out.println("AuditStudent goto class -> Auditoriam "+this.name);
	}
	
	public String toString() {
		String strObj = "AuditStudent name is "+this.name;
		return strObj;
		
	}
		
}
	

