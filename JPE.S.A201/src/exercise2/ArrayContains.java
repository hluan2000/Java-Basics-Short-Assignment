package exercise2;

import java.util.Arrays;
import java.util.List;

public class ArrayContains {
	public static void main(String[] args) {
		String[] test = new String[] { "FTP", "Fresher", "Acedemy", "2021" };
		List<String> testlist = Arrays.asList(test);
		if (testlist.contains("Fresher")) {
			System.out.println("Contained!");
		} else
			System.out.println(" Not Contained!");
	}
}
