package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

//Function é uma interface funcional que recebe argumentos
//e retorna um resultado a partir desses argumentos
public class _Function {
	
	public static void main(String[] args) {
		
		System.out.println(increment(0));
		
		System.out.println(incrementByOneFunction.apply(5));
		
		System.out.println(incrementByOneAndMultiplyBy10.apply(2));
		
		System.out.println(incrementByoneAndMultiplyFunction.apply(2, 5));
		
		System.out.println(sumOfIntegers.applyAsInt(2, 5));
	}
	
	//Interface que recebe um parâmetro de entrada e um segundo de saída
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	
	static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;
	
	//Encadeamento de funções
    static Function<Integer, Integer> incrementByOneAndMultiplyBy10 = 
            incrementByOneFunction.andThen(multiplyBy10Function);
	
	//Função com 2 entradas e uma saída
	static BiFunction<Integer, Integer, Integer> incrementByoneAndMultiplyFunction = 
	        (number, numToMultiply) -> (number + 1) * numToMultiply;
	
	//Há interfaces especializadas para se trabalhar com números,
	//onde você só envia os parâmetros de entrada
	static ToIntBiFunction<Integer, Integer> sumOfIntegers = (num1, num2) -> num1 + num2;
	
	static int increment(int number) {
		return number + 1;
	}
	
	static int incrementByoneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }

}
