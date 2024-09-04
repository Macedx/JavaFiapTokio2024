package logica.aulas.aula07;

import java.util.Scanner;

public class Atividade03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número n: ");
		
		int n = scanner.nextInt();
		int cont = 1;
		
		while (cont <= n) {
			
			System.out.println(cont);
			
			cont++;
		}
		scanner.close();
	}
}