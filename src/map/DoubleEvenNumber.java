package map;

import java.util.List;

public class DoubleEvenNumber {

	public static List<Integer> doubleEvenNumber(List<Integer> numbers) {
		return numbers.stream().filter(number -> number % 2 == 0).map(number -> 2 * number).toList();
	}

	public static <T> void display(List<T> list) {
		list.forEach(System.out::println);
	}
}
