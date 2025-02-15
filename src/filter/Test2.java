package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Pushpita", "Prakhar", "Dinesh", "Rashmi");
		List<String> filteredOutput = names.stream().filter(n -> n.startsWith("P")).collect(Collectors.toList());
		filteredOutput.forEach(System.out::println);
		System.out.println("-----------------------------");
		names.stream().filter(n -> n.startsWith("P")).forEach(System.out::println);
	}

}
