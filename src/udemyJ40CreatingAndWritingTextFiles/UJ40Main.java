package udemyJ40CreatingAndWritingTextFiles;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class UJ40Main {

	public static void main(String[] args) {
		File file = new File("text3.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {			
			bw.write("This is line one");
			bw.newLine();
			bw.write("This is line two");
			bw.newLine();
			bw.newLine();
			bw.write("This is line last");
		} catch (IOException e) {
			System.out.println("Unable to read file:" + file.toString());
		}


	}

}
