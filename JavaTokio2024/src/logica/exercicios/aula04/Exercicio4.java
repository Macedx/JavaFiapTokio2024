
	package logica.exercicios.aula04;

	import java.util.Scanner;

	public class Exercicio4 {
		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.printf("Digite seu nome: ");
			String nome = scanner.nextLine();
			
			System.out.printf("Digite sua idade: ");
			int idade = scanner.nextInt();
			
			System.out.printf ("Olá, %s! Você tem %d anos.", nome, idade);
			
			scanner.close();
		}
	}