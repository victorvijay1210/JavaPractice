package Comparable;

public class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;

	}

	@Override
	public int compareTo(Person other) {
		// TODO Auto-generated method stub
		return this.age-other.age;
	}
	
	public String toString() {
		return name +"-"+ age;
		
	}

}
