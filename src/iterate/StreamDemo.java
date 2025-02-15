package iterate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book("Java Basics", new Author("James", "james123@yahoo.com", 45,'M'), 600));
		bookList.add(new Book("Python Basics", new Author("Joe", "joes32@yahoo.com", 24, 'M'), 400));
		bookList.add(new Book("Java Script", new Author("Abhishek", "abhi120@yahoo.com", 32,'M'), 900));
		bookList.add(new Book("Spring Boot", new Author("Videh", "videh9@yahoo.com", 28,'M'), 800));
		bookList.add(new Book("HTML5", new Author("Sandhya", "sandhya22@yahoo.com", 22,'F'), 500));

		List<String> filteredAuthorNameList = new ArrayList<String>();
		filteredAuthorNameList = bookList.stream().map(book -> book.getAuthor()).filter(author -> author.getAge() > 25)
				.map(Author::getName).map(String::toUpperCase).distinct().limit(2).collect(Collectors.toList());
		System.out.println(filteredAuthorNameList);
		
		System.out.println("Sum of Ages of Male Authors younger than30");
		bookList.stream().map(Book::getAuthor).filter(e->e.getGender()=='M'&&e.getAge()<30).forEach(System.out::println);
		Integer sumOfMaleAuthors = bookList.stream().map(Book::getAuthor).filter(e->e.getGender()=='M'&&e.getAge()<30).map(Author::getAge).reduce(0,Integer::sum);
        System.out.println("Sum Of Male Authors whose age<30 is: "+sumOfMaleAuthors);

	}

}
