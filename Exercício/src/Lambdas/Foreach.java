package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovadosList = Arrays
				.asList("Bia", "Lia", "Liz");
		System.out.println("Forma tradicional...");
		for(String nome: aprovadosList) {
			System.out.println(nome);
		}
		
		System.out.println();
		aprovadosList.forEach(nome -> { System.out.println(nome + "!!!");});
	}
}
