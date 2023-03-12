package ioStreams;

import java.io.FileInputStream;
import java.util.Properties;
public class PropertyFilesSample {

	public static void main(String[] args) {
		Properties connProp = new Properties();
		connProp.setProperty("username","trg08");
		connProp.setProperty("password","trg08");
		FileOutputStream propsFile= new FileOutputStream("C:\\IBM project");
		connProp.store(propsFile, "Properties File");
		propsFile.close(); 
		
		String uname=null;
		String password=null;
		Properties tempProp= new Properties();
		FileInputStream obtained = new FileInputStream("C:\\IBM project");
		tempProp.load(obtained);
		//propsFile.close();
		uname=tempProp.getProperty("username");
		password=tempProp.getProperty("password");
		System.out.println(uname+" "+password);
		
	}

}