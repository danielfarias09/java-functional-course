package functionalinterface;

import java.util.function.Supplier;

//Suplier não recebe nenhum argumento, mas retorna um valor
//Supplier em inglês significa: Produtor
public class _Suplier {

    public static void main(String[] args) {
        System.out.println(getDbConnectionURL());
        System.out.println(getDbConnectionURLSupplier.get());

    }
    
    static String getDbConnectionURL() {
        return "jdbc://localhost:5432/users";
    }
    
    static Supplier<String> getDbConnectionURLSupplier = () 
            -> "jdbc://localhost:5432/users";

}
