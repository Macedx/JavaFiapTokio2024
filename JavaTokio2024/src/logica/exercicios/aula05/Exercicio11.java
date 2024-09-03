package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
//		Faça o cálculo contrário do último exercício (Exercício 10):
//			▪ Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em
//			anos, meses e dias. Também considere todo ano com 365 dias e todo mês com 30
//			dias.
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite sua idade em dias vividos: ");
		int idadeEmDias = scanner.nextInt();
		

		
		int anos = idadeEmDias / 365;
		System.out.printf("Voce tem %d anos", anos);

		scanner.close();
	}

}
