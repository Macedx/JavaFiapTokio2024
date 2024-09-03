package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio3 {
	
	
//	Elabore um programa que receba o nome do usuário e o seu gênero da seguinte
//	forma:
//		▪ [ M ] para masculino
//		▪ [ F ] para feminino
//		▪ [ O ] outro
//		▪ [ N ] não responder
//
//		▪ Exiba uma mensagem final da seguinte forma:
//		▪ “Olá, Alexandre! Você escolheu a seguinte opção de gênero: M”

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("Digite seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.printf("Digite seu genero, com: \n M para Masculino"
				+ " \n F para Feminino \n O para Outro \n N para Não quero responder ");
		
		char genero = scanner.nextLine().charAt(0);//charAt(índice)
		
		System.out.printf ("Ola, %s! Voce escolheu a seguinte opcao de genero: %c", nome, genero);

		scanner.close();
	}

}
