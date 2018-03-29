package io;

import java.io.IOException;

public class FileReadTest {

	public static void main(String[] args) {
		FileRead frd= new FileRead();
		
		try {
			frd.rd("D:\\Prog\\Java Programs\\DTJAVA_S180394.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{		//to close every file after opening and reading
			frd= null;
		}
	}
}
