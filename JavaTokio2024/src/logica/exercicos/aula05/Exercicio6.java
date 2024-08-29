package logica.exercicos.aula05;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
//		▪ Neste problema, deve-se ler o nome de uma peça que chamaremos de peça1, o
//		número de peças1 que o usuário quer, o valor unitário de cada peça1, o nome de uma
//		peça2, o número de peças2 e o valor unitário de cada peça2. Após, calcule e mostre o
//		valor a ser pago.
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o nome da peca 1: ");
		String peca1 = scanner.nextLine();
		
		System.out.println("Digite a quantidade de pecas 1: ");
		int qtdPeca1 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o valor unitario da peca 1: ");
		double precoPeca1 = Double.parseDouble(scanner.nextLine());
		
		double totalPeca1 = precoPeca1 * qtdPeca1;
		
		System.out.println("Digite o nome da peça 2: ");
		String peca2 = scanner.nextLine();
		
		System.out.println("Digite a quantidade de pecas 2: ");
		int qtdPeca2 = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Digite o valor unitario da peca 2: ");
		double precoPeca2 = Double.parseDouble(scanner.nextLine());
		
		double totalPeca2 = precoPeca2 * qtdPeca2;
		
		double aPagar = totalPeca1 + totalPeca2;
		
		String aPagarStr = Double.toString(aPagar);
		
		System.out.printf("O valor a ser pago pelas pecas e de R$ %s", aPagarStr);
		
		scanner.close();

	}

}
