package iterate;

import java.util.Date;
import java.util.stream.Stream;

public class StreamDemo7 {

	public static void main(String[] args) {

		Stream<Date> dateStream = Stream.generate(() -> {
			return new Date();

		});
		dateStream.limit(4).forEach(System.out::println);

	}

}
