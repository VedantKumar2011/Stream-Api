package iterate;

import java.util.stream.Stream;

public class StreamDemo9 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("Vikas", "Amitabh", "Nikhil Mahadev", "Pramod", "Bhawna", "Renuka");
		// stream.sorted().forEach(e->System.out.println(e.toUpperCase()));
		System.out.println("===========================================");
		stream.sorted().map(String::toUpperCase).forEach(System.out::println);

	}

}
