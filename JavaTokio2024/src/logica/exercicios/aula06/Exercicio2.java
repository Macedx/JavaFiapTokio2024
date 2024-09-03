package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
//		Faça um programa que peça dois números e imprima o maior deles, e informe caso
//		eles sejam iguais.
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um numero: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Digite outro numero: ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.printf("O maior numero e %d", num1);
		}
		else {
			System.out.printf("O maior numero e %d", num2);
		}
		scanner.close();
	}

	
}
