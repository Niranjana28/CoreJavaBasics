package ioStreams;

import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		char[] array=new char[100];
		try {
			//Create a reader using the FileReader
			FileReader input = new FileReader("C:\\IBM project\\assginment");
			
			//Reads characters
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			
			//closes the reader
			input.close();
		 }
		catch (Exception e) {
			e.getStackTrace();
			System.out.println(e.toString());
		}

	}

}
