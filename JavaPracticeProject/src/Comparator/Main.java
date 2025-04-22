package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Vijay", 28));
		persons.add(new Person("Ajay", 27));
		persons.add(new Person("Manish", 27));
		persons.add(new Person("Rahul", 29));
		persons.add(new Person("Kishore", 29));

		// Compare by name & we used Lambda Expressions for comparator
		Comparator<Person> byName = (b1, b2) -> b1.name.compareToIgnoreCase(b2.name);

		// Compare by age it returns ascending order & we used Lambda Expressions for
		// comparator
		Comparator<Person> byAge = (b1, b2) -> b1.age - b2.age;

		// Compare by age it returns descending order & we used Lambda Expressions for
		// comparator
		Comparator<Person> byAgeRev = (b1, b2) -> b2.age - b1.age;

		// Sort by name
		Collections.sort(persons, byName);
		System.out.println("Sorted by Title (alphabetically): " + persons);

		// Sort by age
		Collections.sort(persons, byAge);
		System.out.println("Sorted by Price (ascending): " + persons);

		// Reverse Sort by age
		Collections.sort(persons, byAgeRev);
		System.out.println("Sorted by Price (descending): " + persons);

		// Custom Sort with Multiple Criteria
//Let’s say we want to sort by age first, but if two people have the same age, we want to sort them by name.
		Comparator<Person> byAgeThenName = Comparator.comparing((Person p) -> p.age)
				.thenComparing((Person p) -> p.name);
		// Sort by age then by name
		Collections.sort(persons, byAgeThenName);
		System.out.println("Sorted by Age then Name: " + persons);
	}

}
