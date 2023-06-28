package Classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 27;
		d1.mes = 04;
		d1.ano = 2004;
		
		Data d2 = new Data();
		d2.dia = 22;
		d2.mes = 01;
		d2.ano = 2003;
		
		
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
	}		
}
