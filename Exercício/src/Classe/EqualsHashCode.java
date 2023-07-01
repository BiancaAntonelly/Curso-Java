package Classe;

public class EqualsHashCode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Marcantoni Melo";
		u1.email = "marcantonimelo@email.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Bianca Santos";
		u2.email = "biancasantos@email.com.br";
		
		Usuario u3 = new Usuario();
		u3.nome = "Bianca Santos";
		u3.email = "biancasantos@email.com.br";
		
		System.out.println(u1==u2);
		System.out.println(u2.equals(u2));
		System.out.println(u2.equals(u3));
	}
}
