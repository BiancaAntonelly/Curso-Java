package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		double a = Math.pow(6*(3+2), 2);
		double denominadora = 3*2; 
		double b = Math.pow((1-5)*(2-7), 2);
		double denominadorb = Math.pow(2, 2);
		
		
		double novoa = (a/denominadora);
		double novob = (b/denominadorb);
		
		double numeradortotal = Math.pow((novoa - novob),3);
		double denominadortotal = Math.pow(10, 3);		
		double resultado = (numeradortotal/denominadortotal);
		
	
		System.out.println(resultado);
		
	}

}
