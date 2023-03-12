package com.ClassesAndObjects;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberSamplePercentages {

	public static void main(String[] args) {
		Double percent = new Double(0.75);
		NumberFormat percentFormatter;
		String percentOut;
		
		percentFormatter = NumberFormat.getPercentInstance(Locale.US);
		percentOut = percentFormatter.format(percent);
		System.out.println(percentOut);
	}

}
