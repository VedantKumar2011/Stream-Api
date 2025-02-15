package iterate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo8 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		// converting list into stream
		Stream<Integer> stream = list.stream();
		Integer[] evenNumber = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		for (Integer i : evenNumber) {
			System.out.println(i);
		}

	}

}
