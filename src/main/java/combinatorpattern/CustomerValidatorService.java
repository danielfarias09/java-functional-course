package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    
    private boolean isEmailValid(String email) {
        return email.contains("@");
    }
    
    private boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+55");
    }
    
    private boolean isAdult(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears() > 18;
    }
    
    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
               isPhoneNumberValid(customer.getPhoneNumber()) &&
               isAdult(customer.getDateOfBirth());
    }

}
