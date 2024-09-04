package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num, soma = 0;
		System.out.printf("Digite um numero: ");
		num = scanner.nextInt();
		
		soma = soma + num;
		System.out.println("Variavel soma agora vale: "+ num);
		
		soma += num;
		System.out.println("Variavel soma agora vale: "+ soma);
		
		scanner.close();

	}

}
