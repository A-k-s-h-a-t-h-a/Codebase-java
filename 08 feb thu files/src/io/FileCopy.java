package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public void copy(String source, String destination)
	{
		FileInputStream in= null;
		FileOutputStream out= null;
		try {
			in= new FileInputStream(source); //creating instances since method cannot be called
			out= new FileOutputStream(destination);
			
			int b=0;
			while((b= in.read())!=-1)
			{
				//System.out.println(Character.toChars(b));
				out.write(b);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try{
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
