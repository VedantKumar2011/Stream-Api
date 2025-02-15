package iterate;

import java.util.Arrays;

public class StreamDemo3 {

	public static void main(String[] args) {
		int[] numberArray= {2, 4, 6, 9, 12};
		int sum = Arrays.stream(numberArray).sum();
		System.out.println("Sum = "+sum);
		long count = Arrays.stream(numberArray).count();
		System.out.println("Count = "+count);
		double average = Arrays.stream(numberArray).average().getAsDouble();
		System.out.println("Average = "+average);
		System.out.println("-------Calculating Sum using reduce() method---------");
		int reduceSum = Arrays.stream(numberArray).reduce(0,(a,b)->a+b);
		System.out.println("Sum = "+reduceSum);

	}

}
