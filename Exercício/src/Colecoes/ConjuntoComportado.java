package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoComportado {
	public static void main(String[] args) {
		Set<String> listaSet = new HashSet<String>();
		listaSet.add("Folha");
		listaSet.add("Caderno");
		listaSet.add("Livro");
		listaSet.add("Pasta");
		listaSet.add("Caneta");
		
		for(String materialEscolar: listaSet) {
			System.out.println(materialEscolar);
		}
		Set<Integer> listaQtd = new HashSet<Integer>();
		listaQtd.add(2);
		listaQtd.add(3);
		listaQtd.add(2);
		listaQtd.add(10);
		listaQtd.add(1);
		listaQtd.add(7);
		
		for(Integer materialEscolarQtd: listaQtd) {
			System.out.println(materialEscolarQtd);
		}
	}
}
