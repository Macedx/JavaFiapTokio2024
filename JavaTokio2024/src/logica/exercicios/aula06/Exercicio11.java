package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
//			▪ Faça um programa que recebe:
//			▪ o código do estado de origem da carga de um caminhão, supondo que é um número inteiro
//			de 1 a 5
//			▪ o peso da carga do caminhão em toneladas
//			▪ o código da carga, supondo que é um número inteiro de 10 e 40
//
//			▪ Seu programa deve calcular:
//			▪ o peso da carga do caminhão convertido em quilos
//			▪ o preço da carga do caminhão
//			▪ valor do imposto que e cobrado com base no preço da carga e do estado de origem
//			▪ o valor total transportado pelo caminhão (carga + impostos)
//		
//		Estado | Imposto
//		1	   |  35%
//		2      |  25%
//		3      |  15%
//		4      |  5%
//		5      |  isento
//		
//		Código da carga | Preço por KG
//			10 a 20		|	R$100,00
//			21 a 30		|	R$250,00
//			31 a 40		|	R$340,00		
		
		Scanner scanner = new Scanner (System.in);
		
//		Estado: 4
//		Peso Kg: R$1000,00
//		Código da carga: 31
//		Preço da carga = R$340.000,00
//		Imposto: R$17.500,00
//		valorFinal: R$357.500,00
		
		System.out.println("Origem/Estado da carga (1-5)");
		int estado = scanner.nextInt();
		
		System.out.println("Digite o peso do caminhao em toneladas: ");
		double pesoToneladas = scanner.nextInt();
		
		System.out.println("Codigo da carga (10-40:" );
		int codigoCarga = scanner.nextInt();
		
		//Conversao de toneladas para quilogramas
		
		double pesoKg = pesoToneladas * 1000;
		
		//Preço da carga do caminhão
		
		double precoPorKg = 0;
		
		if (codigoCarga >= 10 && codigoCarga <= 20) {
			precoPorKg = 100;
		}
		else if (codigoCarga <= 30) {
			precoPorKg = 250;
		}
		else if (codigoCarga <= 40) {
			precoPorKg = 340;
		}
		
		//Verificação da porcentagem do imposto de acordo com o estado de origem
		
		double impostoPorcentagem = 0;
		
		if (estado == 1) {
			impostoPorcentagem = 0.35;
		} else
		if (estado == 2) {
			impostoPorcentagem = 0.25;
		} else
		if (estado == 3) {
			impostoPorcentagem = 0.15;
		} else
		if (estado == 4) {
				impostoPorcentagem = 0.05;
		} else
		if (estado == 5) {
					impostoPorcentagem = 0;
		}
			
		//CALCULO PRECO CARGA
		
		double precoCarga = (pesoKg * precoPorKg); // 1000 * 30
		
		//CALCULO DO VALOR DO IMPOSTO
		
		double imposto = precoCarga * impostoPorcentagem; // 340.000 * 0.05
		
		// CALCULO DO VALOR FINAL precoCarga + imposto
		double valorFinal = precoCarga + imposto;
		
		System.out.println("Peso da carga em KG: " + pesoKg );
		System.out.println("Preco da carga: " + precoCarga);
		System.out.println("Valor do imposto: " + imposto );
		System.out.println("Valor final: " + valorFinal );
		
		scanner.close();
	}

}
