package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
	Compra c1 = new Compra();
	c1.cliente = "Bianca";
	c1.itens.add(new Item("Sorento", 2, 30.390));
	c1.itens.add(new Item("Parati", 2, 30.390));
	c1.itens.add(new Item("Sorento", 2, 30.390));
	
	System.out.println(c1.itens.size());
	System.out.println(c1.valorTotal());
	}
}
