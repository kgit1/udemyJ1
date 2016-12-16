package udemyJ35MultipleExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Test {
	public void run() throws IOException, ParseException {
//		throw new IOException();
		throw new ParseException("Erron in command line", 22);
	}
	
	public void input()throws IOException,FileNotFoundException{
		
		throw new FileNotFoundException("Erron in command line");
	}
}
