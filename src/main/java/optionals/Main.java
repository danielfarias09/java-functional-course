package optionals;

import java.util.Optional;

//Optionals ajudam a evitar null point exception
public class Main {

    public static void main(String[] args) {
        Object value = Optional.ofNullable(null)
            .orElseGet(() -> "Default value");
        
        System.out.println(value);
        
        Optional.ofNullable("danielfarias09@hotmail.com")
            .ifPresent(email -> System.out.println("Sending e-mail to " + email));
        
        Object value2 = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Exception"));
        
        

    }

}
