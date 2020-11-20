package functionalinterface;

import java.util.function.Predicate;

//Predicate, recebemos argumentos e retornamos um boolean
//Usado normalmente para testar se o argumento passado possui uma dada caracter�stica(Predicado)
public class _Predicate {
    
    public static void main(String[] args) {
        
        //Normal
        System.out.println("Normal");
        System.out.println(isPhoneNumberValid("085996376591"));
        System.out.println(isPhoneNumberValid("08599637659"));
        System.out.println(isPhoneNumberValid("088996376591"));
        
        //Predicate
        System.out.println("Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("085996376591"));
        System.out.println(isPhoneNumberValidPredicate.test("08599637659"));
        System.out.println(isPhoneNumberValidPredicate.test("088996376591"));
        
        //Podemos encadear v�rios Predicates para realizar v�rios tipos de valida��o
        System.out.println("Predicate encadeado");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber9).test("085996376591"));
    }
    
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("085") && phoneNumber.length() == 12;
    }
    
    //Predicate recebe um argumento e retorna um booleano
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> 
           phoneNumber.startsWith("085") && phoneNumber.length() == 12;
           
    static Predicate<String> containsNumber9 = phoneNumber ->
           phoneNumber.contains("9");

}
