package logica.aulas.aula10;

import java.util.Scanner;

public class MetodosComArg {
	
//	FUNÇÃO COM PARÂMETRO E SEM RETORNO PARA EXIBIR NOME PERSONALIZADO

	static void saudacaoComArgs(String nome) { // void = vazio só executa e não retorna nada
		System.out.println("Seja bem-vindo, "+nome);
	}
	
//	FUNÇÃO COM PARÂMETRO E SEM RETORNO PARA EXIBIR UMA SOMA 
	
	static void somar (int n1, int n2) {
		
		System.out.println("Soma: " + (n1 + n2) );
		
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nomeDigitado = scanner.nextLine();
		
//		CHAMANDO A FUNÇÃO saudacaoComArgs E PASSANDO COMO PARÂMETRO A STRING nomeDigitado
		saudacaoComArgs(nomeDigitado);
		
//		CHAMANDO FUNÇÃO DE SOMA
		somar( 2, 3 );
	}
	

}
