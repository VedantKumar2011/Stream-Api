package iterate;

import java.util.ArrayList;
import java.util.List;

public class TerminalOperation1 {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Harshita");
		names.add("Harsh");
		names.add("Akansha");
		names.add("Akshat");
		names.add("Harry");
		names.add("Nirav");

		System.out.println("______Displaying ALL THE NAMES_______");

		names.stream().forEach(System.out::println);

		System.out.println("________Displaying Names in Sorted Order in UpperCase____");

		names.stream().map(String::toUpperCase).sorted().forEach(System.out::println);

		System.out.println("________ANY MATCH____________");
		boolean anyMatch = names.stream().anyMatch(e -> e.startsWith("A"));
		System.out.println(anyMatch);
		System.out.println("_________ALL MATCH___________");
		boolean allMatch = names.stream().allMatch(e -> e.startsWith("A"));
		System.out.println(allMatch);
		System.out.println("_________NONE MATCH___________");
		boolean noneMatch = names.stream().noneMatch(e -> e.startsWith("A"));
		System.out.println(noneMatch);
		System.out.println("_________COUNT___________");
		long count = names.stream().filter(e -> e.startsWith("H")).count();
		System.out.println("Count = " + count);
		System.out.println("______ASCENDING ORDER LIMIT______");
		names.stream().sorted().limit(4).forEach(System.out::println);
		System.out.println("______DESCENDING LIMIT______");
		names.stream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(System.out::println);
		System.out.println("______DESCENDING ORDER LIMIT______");
		names.stream().sorted((e1, e2) -> e2.compareTo(e1)).limit(4).forEach(System.out::println);
		System.out.println("______DESCENDING ORDER SKIP______");
		//skipping 2 names from descending order
		names.stream().sorted((e1, e2) -> e2.compareTo(e1)).skip(2).forEach(System.out::println);
		System.out.println("_______CONCATENATION________");
		String string = names.stream().reduce((e1,e2)->e1+"@"+e2).get();
		System.out.println("Concatenated String: "+string);
		System.out.println("_______Find First Method________");
		String string2 = names.stream().filter(e->e.startsWith("H")).findFirst().get();
		System.out.println(string2);


	}

}
