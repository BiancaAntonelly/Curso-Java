package Arrays;

import java.util.Scanner;

public class Desafio {
	public static void  main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite quantas notas:");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		
		for(int i=0; i<notas.length; i++) {
			System.out.println("Digite a nota " + i + 1 + ": ");
			notas[i] = entrada.nextInt();
		}
		double total = 0;
		for(double nota: notas) {
			total+=nota;
		}
		System.out.println("A média é: " + (total/notas.length));
		entrada.close();
	}
}
