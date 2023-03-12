package ioStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {
	private static void process(String str) {
		System.out.println(" processing ... > "+ str +" \n");
	}
	private static void doReadFromStdin()
	{
     	try {
	    	BufferedReader inStream = new BufferedReader(new InputStreamReader(System.in));
		    String inLine=" ";
		    while(!(inLine.equalsIgnoreCase("quit"))&& !(inLine.equalsIgnoreCase("exit"))) {
		    	System.out.print("prompt>");
		    	process(inLine);
		    }
		}
		catch (Exception e) {
			System.out.println("IOExeception: "+ e);
		}
	}

	public static void main(String[] args) {
		doReadFromStdin();
		
	}

}
