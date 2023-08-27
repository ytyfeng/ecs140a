package hw2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileBufferedReader {
	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("hw2.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine(); // reads the next line
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
