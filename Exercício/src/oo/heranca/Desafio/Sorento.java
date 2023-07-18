package oo.heranca.Desafio;

public class Sorento extends Carro {
	
	public Sorento() {
		this(315);
	}
	public Sorento(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
		
	}
}
