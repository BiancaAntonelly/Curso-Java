package Lambdas;

public class CalculoTeste2Lambdas {
	public static void main(String[] args) {
		Calculo calc = (x, y) -> { 
			return x+y; 
		};
		System.out.println(calc.executar(2, 3));
		
		//unica sentença de código
		calc = (x,y) -> x*y;
		System.out.println(calc.executar(2, 3));
	}
}
