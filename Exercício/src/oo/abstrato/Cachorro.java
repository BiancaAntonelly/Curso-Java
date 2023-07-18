package oo.abstrato;
//classe concreta
public class Cachorro extends Mamifero{
	@Override
	public String mover() {
		return "Usando as patas";
	}
	public String mamar() {
		return "Usando leite";
	}
}
