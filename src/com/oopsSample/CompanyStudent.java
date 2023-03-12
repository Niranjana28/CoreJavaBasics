package com.oopsSample;

public class CompanyStudent extends Student{
	String companyName;
	public CompanyStudent(String name, String companyName) {
		this.name=name;
		this.companyName = companyName;
		
	}
	public void gotoClass() {
		System.out.println("Goto class after evaluation.. "+this.name);
	}
	public String toString() {
		String strObj = "CompanyStudent is "+this.name;
		return strObj;
		
	}
	
}
