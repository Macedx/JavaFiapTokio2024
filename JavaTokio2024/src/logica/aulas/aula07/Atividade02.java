package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		
		int n = scanner.nextInt();
		
//		A solicitação é uma tabuada
		
		System.out.println(n + " x 1 = " + (n * 1));
		System.out.println(n + " x 2 = " + (n * 2));
		System.out.println(n + " x 3 = " + (n * 3));
		System.out.println(n + " x 4 = " + (n * 4));
		System.out.println(n + " x 5 = " + (n * 5));
		
//		Dessa forma, se a demanda for uma tabuada até 10? 100? 1000?
//		Não dá pra fazer na mão
		 
		scanner.close();
	}
}
