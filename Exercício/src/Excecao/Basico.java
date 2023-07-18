package Excecao;

public class Basico {
	public static void main(String[] args) {
		try {
			System.out.println(7/0);
			} catch (Exception Exception){
				System.out.println("Erro do usuario");
		}
		try {
			System.out.println(7/0);
			} catch (ArithmeticException e) {
				e.printStackTrace();
		}
		System.out.println("Fim!");
	}
}
