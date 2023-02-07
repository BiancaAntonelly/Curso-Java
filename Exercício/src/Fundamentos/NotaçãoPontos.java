package Fundamentos;

public class NotaçãoPontos {
	public static void main(String[] args) {
		String s = "Bom Dia X";
		s = s.toUpperCase(); // COLOCA TODA A STRIND EM MAIÚSCULO
		System.out.println(s);
		s = s.replace("X", "Marcantoni"); //Tira o X e coloca um nome desejado
		s = s.concat("!!!"); // concateia
		System.out.println(s);
	    String v = "Boa Noite F".toUpperCase(). replace("F","Bianca");
	    System.out.println(v);
	}
}
