package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
//		▪ Escreva um programa que dado um inteiro n positivo calcula e imprime a soma de
//		todos os números inteiros entre 1 e n.
//		▪ Valide a entrada do usuário, só aceite números positivos!!
//
//		▪ Dica: use do/while para a validação e for para a soma.
//
//		▪ Por exemplo, se n = 10 então deverá ser calculado:
//		▪ 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55
//		▪ E a impressão final seria:
//		▪ A soma de 1 até 10 é: 55
		
		Scanner scanner = new Scanner(System.in);
		int num=0;
		do {
		System.out.println("Digite um numero inteiro positivo: ");
		while (!scanner.hasNextInt()) {
			System.out.println("ERRO! Digite apenas numeros POSITIVOS");
			scanner.next();
			
			scanner.close();
		}
		
		 num = scanner.nextInt();
		}
		while (num <= 0);
		
		
		
		
			int soma = 0;
			for (int i = 1; i <= num; i++ ) {
				soma += i;
			}
			System.out.println(soma);
			
		
	}
}

