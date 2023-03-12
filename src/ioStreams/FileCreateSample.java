package ioStreams;

import java.io.File;

public class FileCreateSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir =new File("C:\\IBM project");
		checkdir(dir);
		boolean value=false;
			//checkdir(files[i]);
		try {
			boolean isDir=dir.mkdir();
			dir.getAbsoluteFile();
			//System.out.println(dir.p);
			//System.out.println(dir.getAbsoluteFile());
			dir.exists();
			if(isDir)
			{
				File file=new File(dir.getAbsolutePath()+"newFile.txt");
				value=file.createNewFile();
				System.out.println("file is created" );
			}
			else
				System.out.println("file is not created");
		}
		catch(Exception e){
			e.getStackTrace();
		}
	} 
	public static void checkdir(File file)
	{
		
		if(file.isDirectory()) {
			File newdir[]=file.listFiles();
			for(int i=0; i<newdir.length;i++)
			{
				//System.out.println(newdir[i].getName());
				checkdir(newdir[i]);
			}
		
		}
		else
		{
			System.out.println(file.getName());
		}
			
	}

}



	