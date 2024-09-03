package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//		▪ Faça um programa para a leitura de quatro notas parciais de um aluno. O programa
//		deve calcular a média alcançada pelo aluno e apresentar:
//		▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//		▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
//		▪ A mensagem "Reprovado", se a média for menor que cinco.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com a nota do 1 bimestre: ");
		float nota1 = scanner.nextFloat();

		System.out.println("Entre com a nota do 2 bimestre: ");
		float nota2 = scanner.nextFloat();

		System.out.println("Entre com a nota do 3 bimestre: ");
		float nota3 = scanner.nextFloat();

		System.out.println("Entre com a nota do 4 bimestre: ");
		float nota4 = scanner.nextFloat();

		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A sua media e: "+media );

		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >= 5 && media < 7) {
			System.out.println("Em rcuperacao...");
		} else if (media < 5) {
				System.out.println("Reprovado");
			}
		scanner.close();
		}

	

}
