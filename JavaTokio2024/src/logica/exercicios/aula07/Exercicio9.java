package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
//		Escreva um algoritmo que recebe um inteiro positivo n e imprime todos os divisores
//		positivos de n.
//		▪ Utilize o laço for.
//
//		▪ Exemplo:
//		Suponha que n = 28, nessa situação devemos imprimir os números
//		1, 2, 4, 7, 14 e 28, que são todos os divisores do 28.
//
//		▪ Dica: para o número ser divisor de n, a divisão precisa ter resto nulo.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo: ");
		int n = scanner.nextInt();
		
		scanner.close();
		int divisor = 0;
		 
		System.out.printf("Os divisores de %d sao:\n" , n);
		for (int i = 1; i <= n; i++ ) {
			if ( n%i == 0) {
				// divisor++;
				 System.out.println(i);
			}
		}
	}

}
