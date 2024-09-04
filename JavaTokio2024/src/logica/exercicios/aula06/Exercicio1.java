package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
//		Faça um programa que leia um número, e informe se ele é par ou impar.
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um numero e verificaremos se ele e par ou impar: ");
		int num = scanner.nextInt();

		
		if (num % 2 == 0) {
			System.out.println("O numero e par");
		}
		else {
			System.out.println("O numero e impar");
			
			
		}
	scanner.close();
	}
	
	

}
