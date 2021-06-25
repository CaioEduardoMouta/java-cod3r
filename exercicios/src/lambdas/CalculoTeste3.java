package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		// int n�o converte para double 
		
		BinaryOperator<Double> calculo = (x, y) -> {return  x + y; };
		System.out.println(calculo.apply(2.0,3.0)); 
		
		calculo = (x,y) -> x * y;
		System.out.println(calculo.apply(2.2,3.2)); 
		
		BinaryOperator<Integer> cal2 = (x, y) -> {return  x + y; };
		System.out.println(cal2.apply(2,3)); 
		
		calculo = (x,y) -> x * y;
		System.out.println(cal2.apply(2,2)); 
		
	}
}
