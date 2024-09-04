package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
//			▪ Faça um programa que receba o ano de nascimento da pessoa e retorne:
//			▪ Se o voto é obrigatório este ano;
//			▪ Se o voto é opcional este ano;
//			▪ Se o voto é proibido este ano.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o ano de seu nascimento: ");
		
		int anoNascimento = scanner.nextInt();
		int idade = 2024 - anoNascimento;
		
		if (idade >= 18 && idade <70) {
			System.out.println("Voto obrigatorio (IDADE ENTRE 18 E 70 ANOS)");
		}else
		
		if ((idade >= 16 && idade > 18)|| idade > 70){
			System.out.println("Voto opcional");
		}else
			if (idade < 16) {
				System.out.println("Voto proibido (IDADE INFERIOR A 16 ANOS)");
			}
		
		
		scanner.close();

	}

}
