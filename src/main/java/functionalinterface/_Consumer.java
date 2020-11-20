package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer � uma interface funcional que recebe
//argumentos e n�o retorna nada (void)
public class _Consumer {
    
    public static void main(String[] args) {
        greetCustomer(new Customer("Jo�o", "99999999"));
        greetCustomerConsumer.accept(new Customer("Maria", "88888888"));
        greetCustomerConsumerV2.accept(new Customer("Daniel", "66666666"), false);
        
    }
    
    //(� uma fun��o void que recebe um argumento e n�o retorna nada)
    static Consumer<Customer> greetCustomerConsumer = customer -> 
        System.out.println("Ol� " + customer.name +
                ", obrigado por registrar o n�mero " +
                customer.phoneNumber);
       
    //Recebe 2 argumentos
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> 
    System.out.println("Ol� " + customer.name +
            ", obrigado por registrar o n�mero " +
            (showPhoneNumber ? customer.phoneNumber : "********"));
    
    //Fun��o Java normal
    static void greetCustomer(Customer customer) {
        System.out.println("Ol� " + customer.name +
                ", obrigado por registrar o n�mero " +
                customer.phoneNumber);
    }
    
    static class Customer {
        private final String name;
        private final String phoneNumber;
        
        public Customer(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }      
    }
    

}
