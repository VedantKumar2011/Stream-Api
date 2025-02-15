package iterate;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {

		String[] nameArray = new String[] { "Deshmukh", "Vivekanand", "Aditya", "Sumit", "Vanshi" };
		Stream<String> streamOfNames = Arrays.stream(nameArray);
		Stream<String> filteredString = streamOfNames.filter(e -> e.length() > 6);
		String[] array = filteredString.toArray(String[]::new);
		for (String name : array) {
			System.out.println(name);
		}

	}

}
