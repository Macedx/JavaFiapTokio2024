package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
//		▪ Faça um programa que exiba a mensagem “Olá, Mundo”.
//		▪ Essa mensagem deverá ser exibida repetidamente.
//		▪ Ao final de toda iteração da repetição, você deve perguntar ao usuário se ele deseja
//		exibir a mensagem novamente.
//		▪ Se sim, exiba novamente. Senão, saia do loop e exiba a mensagem “Fim”.

		String resposta;	
		Scanner scanner = new Scanner(System.in);
		
		
		do {
			System.out.println("Ola, Mundo");
			System.out.println("Voce quer exibir a mensagem novamente? (Responda somente com sim ou nao)");
			resposta = scanner.nextLine();
		}
		
		while (resposta.equals("sim"));
			System.out.println("FIM");
			scanner.close();
		}
	}
		

