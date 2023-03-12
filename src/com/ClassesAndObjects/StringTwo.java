package com.ClassesAndObjects;

public class StringTwo {

	public static void main(String[] args) {
		//Initialize name
		String name="Jayaraj Naganiranjana";
		System.out.println("Full name is : "+name);
		
		System.out.println("Initials with surname is: ");
		//Length of thr name
		int len=name.length();
		
		//short the name
		name=name.trim();
		String str1="";
		for(int i=0; i<len; i++) {
			char ch=name.charAt(i);
			if(ch !=' ') {
				str1=str1+ch;
			}
			else {
				System.out.println(Character.toUpperCase(str1.charAt(0))+". ");
				str1 ="";
			}
		}
		
		String str2="";
		for(int j=0; j<str1.length(); j++) {
			if(j==0)
				str2 = str2+Character.toUpperCase(str1.charAt(0));
			else
				str2 = str2+Character.toUpperCase(str1.charAt(j));
		}
		System.out.println(str2);
					
			}
		}
		
	
