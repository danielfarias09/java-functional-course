package finalsection;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;

import combinatorpattern.Customer;

public class Callbacks {

    public static void main(String[] args) {
        
        //Passo uma função como parâmetro tal qual em JavaScript
        hello("Daniel", null, value -> {
           System.out.println(value + " está sem sobrenome"); 
        });
        
        Customer customer = new Customer(
                "Daniel Farias", 
                "danielfarias09@hotmail.com", 
                "+5585996376591",
                LocalDate.of(1990, 11, 27)
        );
        
        String retorno = (String) hello2(customer, c -> c.toString());
        
        System.out.println(retorno);

    }
    
    //Simula uma função de callback como em Javascript
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        
        if(lastName != null) {
            System.out.println(lastName);
        }else {
            callback.accept(firstName);
        }
    }
    
    static Object hello2(Object object, Function<Object,Object> callback) {
        return callback.apply(object);
    }

}
