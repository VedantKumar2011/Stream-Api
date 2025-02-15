package iterate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo6 {

	public static void main(String[] args) {

		// using Stream.of() --> converting array to stream
		Integer[] integerArray = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stream<Integer> stream = Stream.of(integerArray);
		stream.forEach(System.out::println);
		
		System.out.println("----------------------------------");

		// using stream()-->converting
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 9; i++) {
			list.add(i+2);
		}
		//converting into stream
		list.stream().forEach(System.out::println);

	}

}
