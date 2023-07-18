package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(50.91);
		
		Arroz ingrediente1 = new  Arroz(0.78);
		Feijao ingrediente2 = new  Feijao(0.78);
		Sorvete sobremesaSorvete = new  Sorvete(0.78);
		
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente1);
		System.out.println(convidado.getPeso());
		convidado.comer(ingrediente2);
		System.out.println(convidado.getPeso());
		convidado.comer(sobremesaSorvete);
		System.out.println(convidado.getPeso());
	}
}
