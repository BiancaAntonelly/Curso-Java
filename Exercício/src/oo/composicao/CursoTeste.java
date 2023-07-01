package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Bianca");
		Aluno aluno2 = new Aluno("Antonelly");
		Aluno aluno3 = new Aluno("Medeiros");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Java Completo 2");
		Curso curso3 = new Curso("Java Completo 3");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno3);
		
	    aluno3.adicionarCurso(curso2);
	    
	    for(Aluno aluno: curso3.alunos) {
	    	System.out.println("Estou matriculando no curso 1...");
	    	System.out.println("e o meu nome é " + aluno.nome);
	    	System.out.println();
	    }
	}
}
