package Desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.345);
		Comida c2 = new Comida("Feijão", 0.455);
		Comida c3 = new Comida("Farofa", 0.13);
		Comida c4 = new Comida("Carne", 0.500);
		
		Pessoa p = new Pessoa("Marcantoni", 87.4);
		System.out.println(p.apresentar());
		p.comer(c4);
		p.comer(c3);
		p.comer(c2);
		p.comer(c1);
		System.out.println(p.apresentar());
		
	}
}
