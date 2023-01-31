// Java Program to Read a Large Text File Line by Line

import java.io.*;
import java.util.Scanner;

public class Large {

	public static void main(String[] args)
		throws FileNotFoundException
	{

		String path = "C:\\Users\\HP\\Desktop\\gfg.txt";

		InputStream is = new FileInputStream(path);

		try (Scanner sc = new Scanner(
				is, StandardCharsets.UTF_8.name())) {

			// It holds true till there is single element
			// left in the object with usage of hasNext()
			// method
			while (sc.hasNextLine()) {

				// Printing the content of file
				System.out.println(sc.nextLine());
			}
		}
	}
}
