package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
//		▪ Faça um programa que receba 12 valores digitados pelo usuário e, ao final, informe
//		qual é o maior deles.
		
		Scanner scanner = new Scanner(System.in);

		
		int maior;
		int i= 0;
		
		while ( i <= 12) {
			
			System.out.println("Digite um valor: ");
			int valor = scanner.nextInt();
			i++;
			
			scanner.close();
		}
	}
		

		

