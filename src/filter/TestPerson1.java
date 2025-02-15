package filter;

import java.util.Arrays;
import java.util.List;

public class TestPerson1 {

	public static void main(String[] args) {
		List<Person1> persons = Arrays.asList(new Person1(101, "Peter", 22), new Person1(102, "Anil", 24),
				new Person1(103, "Sunak", 43), new Person1(104, "Deepak", 41));

		System.out.println("----------Displaying Person detail whose name is Sunak--------");
		Person1 person = persons.stream().filter(p -> p.getName().equals("Sunak")).findAny().orElse(null);
		System.out.println(person);

		System.out.println("----------Displaying Person detail whose name is Peter and Age=22--------");
		Person1 person2 = persons.stream().filter(p -> p.getName().equals("Peter") && p.getAge() == 22).findAny()
				.orElse(null);
		System.out.println(person2);

		System.out.println("------------Displaying names in ascending order----------------");

		persons.stream().map(Person1::getName).sorted().forEach(System.out::println);
		System.out.println("------------Displaying names in desscending order----------------");

		persons.stream().map(Person1::getName).sorted((p1, p2)->p2.compareTo(p1)).forEach(System.out::println);
		

		System.out.println("----First Person details-------------");

		Person1 person1 = persons.stream().findFirst().get();
		System.out.println(person1);

		System.out.println("----First Person name-------------");
		String name1 = persons.stream().findFirst().get().getName();
		System.out.println(name1);
		
		System.out.println("---------------------------");
		persons.stream().filter(p->p.getName().equals("Peter")).forEach(p->System.out.println(p.getName()));
		
		String name2 = persons.stream().filter(p->p.getName().equals("Sunak")).map(Person1::getName).findAny().orElse(null);
		System.out.println(name2);

	}

}
