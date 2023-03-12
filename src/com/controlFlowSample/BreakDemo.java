package com.controlFlowSample;

public class BreakDemo {

	public static void main(String[] args) {
		int[]arrayList= {21,87,3,12,3876,82,127};
		int SearchFor =12;
		int i=0;
		boolean foundIt=false;
		for( ; i<arrayList.length; i++) {
			if(arrayList[i]==SearchFor) {
				foundIt=true;
				break;
			}
		}
			if(foundIt) {
				System.out.println("Found "+ SearchFor +" at index "+ i);
			}
			else {
				System.out.println(SearchFor +" not in the array ");
			}
			
		}
	}


