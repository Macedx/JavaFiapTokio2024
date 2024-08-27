package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite seu nome: ");
		String nome = scanner.nextLine();
		System.out.printf ("Olá, %s!", nome);
		
		scanner.close();
	}
}