package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
//		▪ Escrever um algoritmo para determinar o consumo médio de um automóvel sendo
//		fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
//
//		▪ Dê sua resposta em km por litro de combustível (km/Litro)
//
//		▪ Caso a autonomia do veículo esteja abaixo de 8 km/L, exiba a mensagem:
//		▪ “Esse carro bebe hein!”
//		▪ Senão, exiba a mensagem:
//		▪ “Autonomia legal”
		
		System.out.println("Vamos determinar a autonomia do seu automovel!");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a distancia percorrida pelo seu veiculo em km: ");
		double distanciaPercorrida = scanner.nextDouble();
		
		System.out.println("Digite o total de combustivel gasto durante esse trajeto em litros: ");
		double combustivelGasto = scanner.nextDouble();
		
		double autonomia = distanciaPercorrida / combustivelGasto;
		
		if (autonomia <= 8) {
			System.out.println("Esse carro bebe hein!");
		}
		else {
			System.out.println("Autonomia legal");
		}
		
		scanner.close();
	}
}
