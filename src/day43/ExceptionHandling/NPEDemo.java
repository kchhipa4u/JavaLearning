package day43.ExceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class NPEDemo {

	private static List<String> lst = new ArrayList<>();
	public static void main(String[] args) {
		 System.out.println(lst.size());
	}
}
