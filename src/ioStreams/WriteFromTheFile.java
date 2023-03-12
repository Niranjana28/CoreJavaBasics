package ioStreams;

import java.io.FileWriter;

public class WriteFromTheFile {

	public static void main(String[] args) {
		
		String data= "This is the data in the  file";
		try {
			FileWriter output=new FileWriter("C:\\IBM project");
			output.write(data);
			output.flush();
			output.close();
			
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}

	}

}
