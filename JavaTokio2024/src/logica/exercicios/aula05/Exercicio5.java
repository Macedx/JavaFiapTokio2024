package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
//		▪ Leia 2 valores A e B, que correspondem a 2 notas de um aluno. A seguir calcule e
//		informe a média ponderada do aluno, sabendo que a nota A tem peso 4 e a nota B
//		tem peso 6.
//		▪ Exemplo: nota a * 4 e nota b * 6.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite sua nota da atividade 1: ");
		double nota1 = scanner.nextDouble();

		System.out.printf("Digite sua nota da atividade 2: ");
		double nota2 = scanner.nextDouble();
		
		double media = ((nota1*0.4) + (nota2*0.6));
		String str = Double.toString(media);
		System.out.printf("A sua média ponderada do bimestre é: %s ", str);

		scanner.close();
	}

}
