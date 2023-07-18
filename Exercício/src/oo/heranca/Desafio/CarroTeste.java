package oo.heranca.Desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Civic c1 = new Civic();
		
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		
		Sorento c2 = new Sorento();
			c2.acelerar();
			System.out.println(c2);
			c2.acelerar();
			System.out.println(c2);
			c2.acelerar();
			System.out.println(c2);
	}
}
