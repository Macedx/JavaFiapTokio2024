package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
//		▪ Um professor quer saber quantos alunos de uma sala de 20 tiveram nota maior do
//			que a média. Faça um programa onde o professor informe a média da turma e as
//			notas de cada um dos 20 alunos e, ao final, seja exibido quantos alunos tiveram nota
//			superior à média e quantos tiveram nota inferior à média.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Professor, informe a media da turma: ");
		
		double media = scanner.nextDouble();
		int alunosMediaInferior=0, alunosMediaSuperior = 0;
		
		
		double nota;
		
		for (int i =0; i <=5; i++) {
			System.out.println("Informe a nota do aluno ");
			 nota = scanner.nextDouble();
			 if (media>=nota) {
				 alunosMediaSuperior = alunosMediaSuperior + 1;
				 			 }else if (media <nota){
				 				 alunosMediaInferior++;
				 			 }else
				 			 {
				 				 
				 			 }
		}System.out.printf("Tiveram %d alunos com media inferior a media.\n"
				+ "Tiveram %d alunos com media superior ou igual a media.", alunosMediaInferior, alunosMediaSuperior);
		
		
		scanner.close();
		}

	}
