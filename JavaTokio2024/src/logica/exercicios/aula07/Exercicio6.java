package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
//		▪ Faça um programa capaz de exibir todos os valores pares entre 2 e um valor fornecido
//		pelo usuário.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int x = scanner.nextInt();
	
		for (int i=2; i<=x; i+=2) {
			System.out.println(i);
		}
		scanner.close();
	}


}
