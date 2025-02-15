package map;

import java.util.Arrays;
import java.util.List;

public class TestDoubleEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 8, 24, 9, 5, 7, 12, 22, 10);

		System.out.println("==== numbers before applying method =====");
		DoubleEvenNumber.display(numbers);
		System.out.println("==== numbers before applying method =====");
		DoubleEvenNumber.display(DoubleEvenNumber.doubleEvenNumber(numbers));
	}

}
