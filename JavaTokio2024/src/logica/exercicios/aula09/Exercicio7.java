package logica.exercicios.aula09;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
//		▪ Escreva um algoritmo que recebe uma lista de nomes e imprime os nomes na ordem
//		inversa a da leitura.
//		▪ A lista termina quando o usuário aperta o Enter sem que nenhum nome tenha sido
//		digitado.
		
		Scanner scanner = new Scanner (System.in);
		
		ArrayList<String> listaNomes = new ArrayList<>();
		
		String resposta = "";
		
		while (true) {
			System.out.println("Digite o nome da pessoa [Tecle enter para finalizar]: ");
			resposta = scanner.nextLine();
		
		if (!resposta.isEmpty()) {
			listaNomes.add(resposta);
		} else {
			break;
		}
	}
		
		for (int i = listaNomes.size() -1; i >= 0; i--) {
			System.out.println(listaNomes.get(i));
		}
		
		
		scanner.close();

	}

}
