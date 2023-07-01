package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(false);
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é " + conjunto.size());
		
		Set numSet = new HashSet();
		
		numSet.add(2);
		numSet.add(3);
		numSet.add(4);
		
		System.out.println(numSet.size());
		conjunto.addAll(numSet);
		System.out.println(conjunto.size());
	}
}
