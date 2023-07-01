package Colecoes;

import java.util.HashMap;
import java.util.Map;


public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Bianca");
		usuarios.put(2, "Marcantoni");
		usuarios.put(3, "Bianca");
		usuarios.put(10, "Bianca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.values());
		System.out.println(usuarios.size());
	}
}
