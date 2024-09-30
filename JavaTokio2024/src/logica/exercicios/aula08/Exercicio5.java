package logica.exercicios.aula08;

import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int n = 0;
		int soma = 0;
		 for (int i = 1; i <=10; i++ ) {
			 n=rand.nextInt(5, 50);
			 System.out.println(n);
			 soma = soma + n;
		 }
		 
		 System.out.printf("A soma dos valores aleatorios entre 5 e 50 e de: "+ soma);
		 
		

	}

}
