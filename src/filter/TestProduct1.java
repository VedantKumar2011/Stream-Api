package filter;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class TestProduct1 {

	public static void main(String[] args) {
		List<Product1> products = Arrays.asList(new Product1(101, "Lenovo Mobile", 20000),
				new Product1(102, "Samsung Mobile", 26000), new Product1(103, "Vivo Mobile", 19000),
				new Product1(104, "Redmi Mobile", 7000));
		System.out.println("____Details of the Product whose price is less than 12000________");
		List<Product1> filteredProduct = products.stream().filter(p -> p.getPrice() > 12000)
				.collect(Collectors.toList());
		filteredProduct.forEach(System.out::println);
		System.out.println("____Products' Name whose price is less than 12000________");
		List<String> filteredProductsName = products.stream().filter(p -> p.getPrice() < 12000).map(Product1::getName)
				.collect(Collectors.toList());
		System.out.println(filteredProductsName);

		System.out.println("____No of Products whose price is greater than 12000________");
		long countOfProducts = products.stream().filter(p -> p.getPrice() > 12000).count();
		System.out.println(countOfProducts);
		System.out.println("____Sum of price of all products________");
		Double totalPrice = products.stream().map(Product1::getPrice).reduce((sum, price) -> sum + price).get();
		System.out.println(totalPrice);
		Double totalPrice1 = products.stream().map(Product1::getPrice).reduce((Double::sum)).get();
		System.out.println(totalPrice1);
		System.out.println("__________Summarizing Products_____________");
		DoubleSummaryStatistics doubleSummaryStatistics = products.stream()
				.collect(Collectors.summarizingDouble(Product1::getPrice));
		System.out.println(doubleSummaryStatistics);
		System.out.println("Average = " + doubleSummaryStatistics.getAverage());
		System.out.println("Sum = " + doubleSummaryStatistics.getSum());
		System.out.println("Max = " + doubleSummaryStatistics.getMax());
		System.out.println("Min = " + doubleSummaryStatistics.getMin());
		System.out.println("Count = " + doubleSummaryStatistics.getCount());
		System.out.println("Class Name = " + doubleSummaryStatistics.getClass());
		Double totalSum = products.stream().collect(Collectors.summingDouble(Product1::getPrice));
		System.out.println("Total Sum = " + totalSum);

		System.out.println("__________MINIMUM PRICE PRODUCT___________");
		Product1 minPriceProduct = products.stream().min((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1).get();
		System.out.println(minPriceProduct);
		System.out.println("__________MAXIMUM PRICE PRODUCT___________");
		Product1 maxProduct = products.stream().max((p1, p2) -> p1.getPrice() > p2.getPrice() ? 1 : -1).get();
		System.out.println(maxProduct);

		System.out.println("---------To convert List into Set--------------");
		Set<Product1> setOfProduct = products.stream().filter(p -> p.getPrice() > 10000).collect(Collectors.toSet());
		System.out.println(setOfProduct);
		Set<Double> setOfPrice = products.stream().filter(p -> p.getPrice() > 18000).map(Product1::getPrice)
				.collect(Collectors.toSet());
		System.out.println(setOfPrice);
		System.out.println("---------To convert List into Map--------------");
		Map<String, Double> map1 = products.stream().collect(Collectors.toMap(p -> p.getName(), p -> p.getPrice()));
		System.out.println(map1);

	}

}
