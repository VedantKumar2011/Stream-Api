package filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		// filtering before JDK 8

		List<String> names = Arrays.asList("Amit", "Piyush", "Tanmoy", "Prisha", "Pushpita");

		List<String> filteredOutput = getFilteredOutput(names);
		for (String name : filteredOutput) {
			System.out.println(name);
		}

	}

	private static List<String> getFilteredOutput(List<String> names) {
		List<String> filteredNameList = new ArrayList<String>();
		for (String name : names) {
			if (name.startsWith("P")) {
				filteredNameList.add(name);
			}
		}
		return filteredNameList;
	}

}
