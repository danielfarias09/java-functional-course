package streams;


import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Daniel", MALE),
                new Person("Izabel", FEMALE),
                new Person("Luiziane", FEMALE),
                new Person("Felipe", MALE),
                new Person("J�ssica", FEMALE),
                new Person("Juninho", MALE)
        );
        
        people.stream()
            .map(person -> person.gender) //modifica a cole��o para retornar os g�neros
            .collect(Collectors.toSet()) // transforma em um set para n�o mostrar os g�neros repetidos
            .forEach(System.out::println); //usando method reference para imprimir os g�neros
        
        //Testa se todas as pessoas s�o do g�nero feminino
        boolean containsOnlyFemale = people.stream()
                .allMatch(person -> MALE.equals(person.gender));
        System.out.println(containsOnlyFemale);
        
      //Testa se tem pelo menos uma pessoa do g�nero feminino
        boolean containsAtLeastOneFemale = people.stream()
                .anyMatch(person -> MALE.equals(person.gender));
        System.out.println(containsAtLeastOneFemale);
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
