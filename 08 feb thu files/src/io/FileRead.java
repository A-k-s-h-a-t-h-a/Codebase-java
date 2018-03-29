package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileRead {
	
	public void rd(String source) throws IOException //catch from main method
	{
/*		FileInputStream  inputStream = new FileInputStream(source);
		
		int b= 0;	//reads character as ASCII value so won't return int
								//reads method one by one, if bytes are available, will return, else will return -1
		while ( (b= inputStream.read())!=-1)
		{
			System.out.print(Character.toChars(b));
		}*/
		
		FileInputStream inputStream= null;
		try{
			inputStream= new FileInputStream(source);
			for(int b=0; ( (b= inputStream.read())!=-1);)
			{
				System.out.print(Character.toChars(b));
			}
		} catch(IOException e){
			e.printStackTrace();
		} 
		finally{
			try
			{
			inputStream.close();
			} 
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
