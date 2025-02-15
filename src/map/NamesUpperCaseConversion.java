package map;

import java.util.List;
import java.util.stream.Collectors;

public class NamesUpperCaseConversion {

	public List<String> toUpperCaseName(List<String> nameList) {
		return nameList.stream().map(String::toUpperCase).collect(Collectors.toList());
	}

	public <T> void displayList(List<T> list) {
		list.forEach(System.out::println);
	}
}
