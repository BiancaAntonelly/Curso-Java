package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nomeCliente;
	final List<Compra> compras = new ArrayList<>();
	
	//construtor
	Cliente(String nomeCliente){
		this.nomeCliente = nomeCliente;
	}
	double obterValorTotal() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
}
