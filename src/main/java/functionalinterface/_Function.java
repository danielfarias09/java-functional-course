package functionalinterface;

import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		
		int increment = increment(0);
		System.out.println(increment);
		
		Integer increment2 = incrementByOneFunction.apply(5);
		System.out.println(increment2);
		
	}
	
	//Entrada primeiro parâmetro e o segundo é a saída
	static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
	
	static int increment(int number) {
		return number + 1;
	}

}
