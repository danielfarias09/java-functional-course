package combinatorpattern;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

import static combinatorpattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer(
                "Daniel Farias", 
                "danielfarias09@hotmail.com", 
                "+5585996376591",
                LocalDate.of(1990, 11, 27)
        );
        
        //Se está válido, podemos salvar no banco de dados
        //System.out.println(new CustomerValidatorService().isValid(customer));
        
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);
        
        System.out.println(result);
        
        if(result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }

    }

}
