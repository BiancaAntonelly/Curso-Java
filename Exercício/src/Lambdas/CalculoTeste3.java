package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> { 
			return x+y; 
		};
		System.out.println(calc.apply(2.0, 3.0));
		
		//unica sentença de código
		calc = (x,y) -> x*y;
		System.out.println(calc.apply(2.0, 3.0));
		System.out.println();
		
		BinaryOperator<Integer> calc2 = (x, y) -> { 
			return x+y; 
		};
		System.out.println(calc2.apply(2, 3));
		
		//unica sentença de código
		calc2 = (x,y) -> x*y;
		System.out.println(calc2.apply(2, 3));
	}
}
