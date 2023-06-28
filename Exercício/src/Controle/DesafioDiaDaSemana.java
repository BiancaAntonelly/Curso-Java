package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana{
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.print("1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.print("2");
		} else if(dia.equalsIgnoreCase("terça")) {
			System.out.print("3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.print("4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.print("5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.print("6");
		}else{
			System.out.print("7");
		}
		entrada.close();
	}
}