package iterate;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {

		// Array of String
		String[] nameArray = new String[] { "Ankur", "bhushan", "deepak Jha", "Vibhas Jha" };
		// converting into Array
		Stream<String> arrayStream = Arrays.stream(nameArray);

		// Convert names into UpperCase

		arrayStream.map(String::toUpperCase).forEach(System.out::println);

		/*Stream<String> upperCaseStream = arrayStream.map(String::toUpperCase);
		String[] upperCaseNameArray = upperCaseStream.toArray(String[]::new);
		for (String name : upperCaseNameArray) {
			System.out.println(name);
		}*/

	}

}
