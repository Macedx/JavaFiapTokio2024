package logica.exercicos.aula05;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
//		▪ Crie um programa que receba o valor do produto e valor pago.
//		▪ Calcule o troco a ser pago.
//		▪ O valor do troco deve ser exibido no terminal.
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do produto: ");
		double valor = scanner.nextDouble();
		
		System.out.println("Digite o valor pago: ");
		double valorPago = scanner.nextDouble();
		
		double troco = valorPago - valor;
		String str = Double.toString(troco);
		System.out.printf("O seu troco é de R$ %s", str);
		
		scanner.close();

	}

}
