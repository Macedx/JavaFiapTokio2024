package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//		▪ Faça um programa que receba um número n
//		▪ Exiba a tabuada deste número do 0 ao 25.
//		▪ Utilize laços de repetição.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Voce quer a tabuada de qual numero? ");
//		Scanner para receber o numero "n"
		int n = scanner.nextInt();
		
//		Fechamento do scanner
		scanner.close();
		
		System.out.println("----------------- \n    TABUADA \n----------------- ");
		
//		Declarei i (os numeros que serao multiplicados com n)
//		Para começando valendo 0, i sendo menor ou igual a 25 e atualizando de 1 em 1, faça:
//			Declarei resultado sendo o numero escolhido pelo usuario multiplicado pelo numero i com as condições do for
//			Exibi n x i = resultado e \n para pular as linhas
		for (int i = 0; i <=25; i++) {
			int resultado = n * i;
			System.out.printf("%d x %d = %d\n", n, i, resultado);
		}
	}

}
