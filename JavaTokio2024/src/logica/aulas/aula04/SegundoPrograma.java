package logica.aulas.aula04;

import java.util.Scanner;

public class SegundoPrograma {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.printf("Olá, %s!", nome);
		
		System.out.println("Digite sua idade: ");
		System.out.println("Sua idade é: " + scanner.nextInt());
		
		scanner.close();

	}

}
