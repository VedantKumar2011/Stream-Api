package iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(12);
		numberList.add(22);
		numberList.add(18);
		numberList.add(16);
		numberList.add(20);
		System.out.println(numberList);

		// converting ArrayList into stream
		Stream<Integer> numberStream = numberList.stream();
		System.out.println(numberStream);
		System.out.println(numberStream.count());
		
       //converting array into stream
		Integer[] array = { 1, 2, 4, 6, 7, 9, 12 };
		Stream<Integer> stream = Arrays.stream(array);
		System.out.println(stream);
		System.out.println(stream.count());

	}

}
