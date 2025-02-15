package iterate;

import java.util.stream.Stream;

public class StreamDemo5 {  //creating stream by using Stream.of()

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 3, 5, 6, 9, 12, 24);
		stream.forEach(e -> System.out.println(e));
		System.out.println("--------------------------------------");
		// In one line
		Stream.of("Aditi", "Videh", "Sunil", "Janki", "Ram").forEach(System.out::println);

	}

}
