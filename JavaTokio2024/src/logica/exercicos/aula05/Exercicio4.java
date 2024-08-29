package logica.exercicos.aula05;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
	
//		▪ Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e
//		informe a média ponderada do aluno.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite sua nota da atividade 1: ");
		double nota1 = scanner.nextDouble();

		System.out.printf("Digite sua nota da atividade 2: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		String str = Double.toString(media);
		System.out.printf("A sua média aritmetica do bimestre é: %s ", str); //se der tudo errado converte pra string sempre
		
		scanner.close();
		
		
	}

}
