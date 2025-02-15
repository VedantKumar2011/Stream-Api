package map;

import java.util.Arrays;
import java.util.List;

public class TestNamesUpperCaseConversion {

	public static void main(String[] args) {

		NamesUpperCaseConversion namesUpperCaseConversion = new NamesUpperCaseConversion();
		List<String> nameList = Arrays.asList("akash", "pushp", "Pradeep", "Anand", "john");
		System.out.println("====displaying names without any case conversion=====");
		namesUpperCaseConversion.displayList(nameList);
		List<String> upperCaseName = namesUpperCaseConversion.toUpperCaseName(nameList);
		System.out.println("====displaying names into uppercase=====");
		namesUpperCaseConversion.displayList(upperCaseName);
	}

}
