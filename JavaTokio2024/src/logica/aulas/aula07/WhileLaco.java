package logica.aulas.aula07;

import java.util.Scanner;

public class WhileLaco {

	public static void main(String[] args) {
/*
		int i = 5;
		
		while (i >= 0 ) {
			System.out.println("Ola mundo " + i);
			i--;
		}
		
		String jogar = "sim";
		Scanner scanner = new Scanner(System.in);
		
		while (jogar.equals("sim")) {
			System.out.println("Repete ou inicia o jogo");
			
			System.out.println("Deseja jogar novamente? ");
			jogar = scanner.nextLine();
			
		}
		scanner.close();
	}*/
	
//	Modificadores de laço
	
	int i = 0;
	
	while (i < 10) {
		i++; //i = 1
		
		if (i == 3) {
			continue; // modificador de fluxo
		}
		if (i == 7) {
			break;
		}
		System.out.println("Produto " + i);
	}
	System.out.println("FIM");
			
	}
}
