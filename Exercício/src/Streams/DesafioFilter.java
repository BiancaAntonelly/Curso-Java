package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		Produto p1 = new Produto("Lapis", 1.99, 0.15, 10.0);
		Produto p2 = new Produto("Impressoda", 1000.99, 0.25, 10.0);
		Produto p3 = new Produto("Notebook", 1999.999, 0.35, 0.0);
		Produto p4 = new Produto("Web Cam", 19.9, 0.1, 50.0);
		Produto p5 = new Produto("Monitor", 899.99, 0.15, 0.0);
		Produto p6 = new Produto("Mouse", 19.9, 0.1, 10.0);
		Produto p7 = new Produto("Bolsa", 52.99, 0.15, 10.0);
		Produto p8 = new Produto("Teclado", 71.99, 0.15, 10.0);
	    Produto p9 = new Produto("Tv", 2900.99, 0.25, 10.0);

	    List<Produto> produtos = 
	    		Arrays.asList(p1,p2, p3, p4, p5, p6, p7, p8, p9);
	
	    Predicate<Produto> superPromocao = p -> p.desconto >=0.15;
	    Predicate<Produto> freteGratis = p -> p.frete >=0;
	    Predicate<Produto> produtoRelevante = p -> p.preco >=50;

	    Function<Produto, String> chamadaPromocional =
	    		p -> "Aproveite! " + p.nome + " por " + p.preco;
	    produtos.stream()
	    .filter(superPromocao)
	    .filter(freteGratis)
	    .filter(produtoRelevante)
	    .map(chamadaPromocional)
	    .forEach(System.out::println);
	}
}
