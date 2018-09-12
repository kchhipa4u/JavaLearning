package day44.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResourceExample1 {

	public static void main(String[] args) throws Exception {
		
		try (BufferedReader br =
			       new BufferedReader(new FileReader("/file.txt"))) {
			//br = new BufferedReader(new FileReader("/output.txt"));
		}
	}
}
