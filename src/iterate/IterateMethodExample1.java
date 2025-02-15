package iterate;

import java.util.stream.Stream;

public class IterateMethodExample1 {

	public static void main(String[] args) {
		
		System.out.println("_____Using Limit and Iterate Method______");
		
		Stream.iterate(5, element->element+1).filter(e->e%2==0).limit(6).forEach(System.out::println);
		Stream<Integer> of = Stream.of(1,3,5,7,9,11,13,15);
		System.out.println("----------------");
		System.out.println(of);
		System.out.println(of.count());

	}

}
