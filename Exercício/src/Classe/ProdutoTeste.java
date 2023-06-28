package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 232.38);
		
		Produto p2 = new Produto("Caneta", 12.56);
		
		Produto.desconto = 0.29;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		System.out.printf("Média do carrinho = R$%2f.", mediaCarrinho);
	}
}
