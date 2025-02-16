package filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2Product1 {

	public static void main(String[] args) {

		List<Product1> productList = Arrays.asList(new Product1(101, "Lenovo Mobile", 20000),
				new Product1(102, "Samsung Mobile", 26000), new Product1(103, "Vivo Mobile", 19000),
				new Product1(104, "Redmi Mobile", 7000));
		System.out.println("_________List of Names________________");
		// productList.stream().filter(p->p.getPrice()>10000).map(Product1::getName).forEach(System.out::println);
		List<String> productNames = productList.stream().filter(p -> p.getPrice() > 10000).map(Product1::getName)
				.collect(Collectors.toList());
		productNames.forEach(System.out::println);

		System.out.println("=========================================");

	}

}
