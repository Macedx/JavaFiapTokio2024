package logica.exercicios.aula04;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite seu salario: ");
		double salario = scanner.nextDouble();
		
		System.out.printf ("Seu salário é de R$" + salario);
		
		scanner.close();
	}
}