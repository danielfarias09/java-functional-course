package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Consumer é uma interface funcional que recebe
//argumentos e não retorna nada (void)
public class _Consumer {
    
    public static void main(String[] args) {
        greetCustomer(new Customer("João", "99999999"));
        greetCustomerConsumer.accept(new Customer("Maria", "88888888"));
        greetCustomerConsumerV2.accept(new Customer("Daniel", "66666666"), false);
        
    }
    
    //(É uma função void que recebe um argumento e não retorna nada)
    static Consumer<Customer> greetCustomerConsumer = customer -> 
        System.out.println("Olá " + customer.name +
                ", obrigado por registrar o número " +
                customer.phoneNumber);
       
    //Recebe 2 argumentos
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) -> 
    System.out.println("Olá " + customer.name +
            ", obrigado por registrar o número " +
            (showPhoneNumber ? customer.phoneNumber : "********"));
    
    //Função Java normal
    static void greetCustomer(Customer customer) {
        System.out.println("Olá " + customer.name +
                ", obrigado por registrar o número " +
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
