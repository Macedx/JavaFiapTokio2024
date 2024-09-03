package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
//		▪ Escreva um algoritmo que recebe dois números e um caractere (representando uma
//		das operações matemáticas (+, -, *, /)
//		▪ O programa deve calcular o valor final de acordo com a operação selecionada.
//		▪ Ou seja, se a entrada for 5, 6 e *, então seu programa dever mostrar 30.
//
//		▪ Dica: switch/case facilita as coisas.
		
		System.out.println("---------------------------\n"
				+ "Calculadora\n"
				+ "--------------------------- \n"
				+ "Operações \n"
				+ "+: Soma; \n"
				+ "-: Subtracao; \n"
				+ "*: Multiplicacao; \n"
				+ "/: Divisao.\n\n ");
		

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o primeiro numero: ");
		double num1 = scanner.nextDouble();
		
		System.out.println("Entre com o segundo numero numero: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("Entre com o simbolo da operacao: ");
		char operacao = scanner.next().charAt(0);
		
		
		double resultado;
		
		switch (operacao) {
		case '+':
			resultado = num1 + num2;
			System.out.println("O resultado da soma e: "+ resultado);
			break;
			
		case '-':
			resultado = num1 - num2;
			System.out.println("O resultado da aubtrcao e: "+ resultado);
			break;
			
		case '*':
			resultado = num1 * num2;
			System.out.println("O resultado da multiplicacao e: "+ resultado);
			break;
			
		case '/':
			resultado = num1 / num2;
			System.out.println("O resultado da divisao e: "+ resultado);
			break;
			
	}
		
	}
}
