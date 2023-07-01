package oo.composicao.Desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Bianca");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem("Notebook", 1897.88, 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 100);
		compra2.adicionarItem("Caderno", 10, 100);
		compra2.adicionarItem("Caderno", 10, 100);
		
		cliente.compras.add(compra1);
		
		System.out.println(cliente.obterValorTotal());
}
}