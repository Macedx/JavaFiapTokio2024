package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
//		▪ Elabore um programa no qual o usuário entre com um número.
//		▪ Após isso seu script deverá exibir o número digitado e sua respectiva separação em
//		centena, dezena e unidade.
//		▪ Exemplo: se o usuário digitar o número 729, deverá ser exibido na tela:
//		▪ Centena = 700
//		▪ Dezena = 20
//		▪ Unidade = 9
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com um numero de 0 a 999: ");
		int num = scanner.nextInt();
		
		System.out.println(" ");
		System.out.println("Valor digitado: " + num);
		
		int centena = (num /100) * 100;
		System.out.println("Centena: " + centena);
		
		int restoCentena = num - centena;
		
		int dezena = (restoCentena / 10) * 10;
		System.out.println("Dezena: " + dezena);
		
		int unidade = restoCentena - dezena ;
		System.out.println("Unidade: " + unidade);
		
		
		scanner.close();
//
//		▪ Obs.: considere que o usuário irá digitar números somente até 999.

		
	}

}
