package application;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import entities.Person;

public class ProgramLambda {

	public static void main(String[] args) {
		List<Person> listPerson = Arrays.asList(
				new Person("Eduardo", 29, 1.65f, 85f),
				new Person("Luiz", 32, 1.98f, 78f),
				new Person("Bruna", 26, 1.75f, 64f));
		
				   System.out.println("Ordenando pessoas pelo nome:");
				   Collections.sort(listPerson, (Person pessoa1, Person pessoa2)
				   -> pessoa1.getName().compareTo(pessoa2.getName()));
				   listPerson.forEach(p -> System.out.println(p.getName()));
				   
				   System.out.println("Ordenando pessoas pela idade:");
				   Collections.sort(listPerson, (Person pessoa1, Person pessoa2)
				   -> pessoa1.getAge().compareTo(pessoa2.getAge()));
				   listPerson.forEach(p -> System.out.println(p.getName()));

	}

}
