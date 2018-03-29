package io;

public class FileCopyTest {

	public static void main(String[] args) {
		FileCopy fc= new FileCopy();
		String source= "D:\\Prog\\Java Programs\\16-Feb-2018-DT-S180391_392.txt";
		String destination= "D:\\Prog\\Java Programs\\copied.txt";
		fc.copy(source, destination);
	}
}
