package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	
//	METODOS SEM RETORNO E SEM PARAMENTROS/ARGUMENTOS
		
//	DECLARAÇÃO DA FUNÇÃO
	static void saudacao() {
		System.out.println("Seja bem-vindo!");
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.println("Seja bem-vindo, "+ nome);
	}

	public static void main(String[] args) {
		
//		CHAMADA DA FUNÇÃO
		saudacao();
	
		
	}

}
