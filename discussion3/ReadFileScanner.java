package hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScanner {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("hw2.txt"));
			while (scanner.hasNextLine()) {
				String s = scanner.nextLine();
				System.out.println(s);
				String[] studentData = s.split(";");
				System.out.println("The student's name is: " + studentData[1] + " " + studentData[2] + "\n");
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
