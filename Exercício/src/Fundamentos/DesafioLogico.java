package Fundamentos;

public class DesafioLogico {
	public static void main(String[] args) {
		
	
		
		boolean trabalhodeterca = true;
		boolean trabalhodequinta = true;
		
		boolean comprouTV50 = trabalhodeterca && trabalhodequinta;
		boolean comprouTV32 = trabalhodeterca ^ trabalhodequinta;
		boolean comprouSorvete = trabalhodeterca || trabalhodequinta;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV de 50 ?" + comprouTV50);
		System.out.println("Comprou TV de 32 ?" + comprouTV32);
		System.out.println("Comprou sorvete? " + comprouSorvete);
		System.out.println("Mais saúdavel? " + maisSaudavel);
		
	}

}
