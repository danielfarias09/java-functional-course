package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

//Function � uma interface funcional que recebe argumentos
//e retorna um resultado a partir desses argumentos
public class _Function {
	
	public static void main(String[] args) {
		
		System.out.println(increment(0));
		
		System.out.println(incrementByOneFunction.apply(5));
		
		System.out.println(incrementByOneAndMultiplyBy10.apply(2));
		
		System.out.println(incrementByoneAndMultiplyFunction.apply(2, 5));
		
		System.out.println(sumOfIntegers.applyAsInt(2, 5));
	}
	
	//Interface que recebe um par�metro de entrada e um segundo de sa�da
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	
	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
	
	//Encadeamento de fun��es
    static Function<Integer, Integer> incrementByOneAndMultiplyBy10 = 
            incrementByOneFunction.andThen(multiplyBy10Function);
	
	//Fun��o com 2 entradas e uma sa�da
	static BiFunction<Integer, Integer, Integer> incrementByoneAndMultiplyFunction = 
	        (number, numToMultiply) -> (number + 1) * numToMultiply;
	
	//H� interfaces especializadas para se trabalhar com n�meros,
	//onde voc� s� envia os par�metros de entrada
	static ToIntBiFunction<Integer, Integer> sumOfIntegers = (num1, num2) -> num1 + num2;
	
	static int increment(int number) {
		return number + 1;
	}
	
	static int incrementByoneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }

}
