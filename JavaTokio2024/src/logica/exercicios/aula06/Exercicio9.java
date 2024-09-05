package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
//		▪ Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa etc.
//		▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
//
//		Tipo cliente   | Valor do KW/h
//		1 (residência) |     0,60
//		2 (comércio)   |     0,48
//		3 (indústria)  |     1,29
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.printf("Tipos de clientes \n 1 - Residencia \n "
				+ "2 - Comercio \n 3 - Industria \n Qual tipo de cliente voce e: ");
		
		int tipoCliente = scanner.nextInt();
		
		System.out.println("Digite o gasto em KW/h: ");
		double kwH = scanner.nextDouble();
		
		double valorKwH = 0;
		
		if (tipoCliente == 1) {
			valorKwH = 0.60; 
		}else
		if (tipoCliente == 2) {
			valorKwH = 0.48;
		}else
		if (tipoCliente == 3) {
			valorKwH = 1.29;
		}
		
		double contaLuz = kwH * valorKwH;
		
		System.out.println("A sua conta de luz deste mes custa R$" + contaLuz);
		
		scanner.close();

	}

}
