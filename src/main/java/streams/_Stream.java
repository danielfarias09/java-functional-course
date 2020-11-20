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
                new Person("Jéssica", FEMALE),
                new Person("Juninho", MALE)
        );
        
        people.stream()
            .map(person -> person.gender) //modifica a coleção para retornar os gêneros
            .collect(Collectors.toSet()) // transforma em um set para não mostrar os gêneros repetidos
            .forEach(System.out::println); //usando method reference para imprimir os gêneros
        
        //Testa se todas as pessoas são do gênero feminino
        boolean containsOnlyFemale = people.stream()
                .allMatch(person -> MALE.equals(person.gender));
        System.out.println(containsOnlyFemale);
        
      //Testa se tem pelo menos uma pessoa do gênero feminino
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
