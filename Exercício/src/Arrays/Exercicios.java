package Arrays;

import java.util.Arrays;

public class Exercicios {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.8;
		notasAlunoA[1] = 6.4;
		notasAlunoA[2] = 9.8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalAlunoA = 0;
		for(int i = 0; i<notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println("Média aluno A: " + (totalAlunoA/notasAlunoA.length));
		
		double[] notasAlunoB = {6.9, 3.2, 10, 8.7};
		double totalAlunoB = 0;
		for(int i = 0; i<notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println("Média aluno B: " + (totalAlunoB/notasAlunoB.length));
		
	}
}
