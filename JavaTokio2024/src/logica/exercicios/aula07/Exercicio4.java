package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
//		▪ Faça um programa que receba 10 valores digitados pelo usuário e, ao final, informe
//		qual é a soma deles.
		
		Scanner scanner = new Scanner(System.in);

		
		int soma = 0;
		int i= 0;
		
		while ( i <= 10) {
			
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			soma += valor;
			i++;
		}
		
		scanner.close();
		System.out.println("A soma dos valores digitados e " + soma);
	}

}
