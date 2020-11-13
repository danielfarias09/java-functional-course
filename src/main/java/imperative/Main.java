package imperative;

import static imperative.Main.Gender.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Daniel", MALE),
				new Person("Izabel", FEMALE),
				new Person("Luiziane", FEMALE),
				new Person("Felipe", MALE),
				new Person("Jéssica", FEMALE),
				new Person("Juninho", MALE)
		);
		
		//Modo Imperativo
		System.out.println("Modo Imperativo");
		List<Person> females = new ArrayList<Person>();
		
		for(Person person: people) {
			if(FEMALE.equals(person.gender)) {
				females.add(person);
			}
		}
		
		for(Person female: females) {
			System.out.println(female);
		}
		
		//Modo Declarativo
		System.out.println("Modo Declarativo");
		List<Person> females2 = people.stream()
			.filter(person -> FEMALE.equals(person.gender))
			.collect(Collectors.toList());
		
			females2.forEach(System.out::println);
		

	}
	
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}	
	}
	
	enum Gender {
		MALE, FEMALE;
	}

}
