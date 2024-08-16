package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadAFile {

	public static void main(String[] args) throws IOException {
		FileInputStream file = null;
		Scanner sc = null;
		try {
			file = new FileInputStream("C:\\Project related\\sample.txt");
		    sc = new Scanner(file, "UTF-8");
		    while (sc.hasNextLine()) {
		        String line = sc.nextLine();
		        System.out.println(line);
		    }
		    // note that Scanner suppresses exceptions
		    if (sc.ioException() != null) {
		        throw sc.ioException();
		    }
		} finally {
		    if (file != null) {
		    	file.close();
		    }
		    if (sc != null) {
		        sc.close();
		    }
		}

	}

}
