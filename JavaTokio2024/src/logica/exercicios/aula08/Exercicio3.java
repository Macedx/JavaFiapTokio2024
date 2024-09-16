package logica.exercicios.aula08;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
//		▪ Faça um programa que recebe um texto qualquer do usuário.
//		▪ A seguir, exiba:
//		▪ A quantidade de caracteres alfabéticos maiúsculos
//		▪ A quantidade de caracteres alfabéticos minúsculos
//		▪ A quantidade de caracteres numéricos
//		▪ A quantidade de espaço em branco
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um texto qualquer: ");
		String str = scanner.nextLine();
		scanner.close();
		
		int tamanhoStr = str.length();
		
		System.out.println(tamanhoStr); // Lengh() mostra o tamanho da string
		
		int ctmaius= 0, ctnum = 0, ctminus = 0, ctbranco = 0; 
		for (int i = 0; i < tamanhoStr; i++) {
			
			// verificando se é um caractere alfabético maiúsculo
			if ((str.charAt(i) >= 'A') && (str.charAt(i) <= 'Z')) {
			ctmaius = ctmaius + 1;
			}
			if ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z')) {
				ctminus = ctminus + 1;
			}
			if (Character.isWhitespace(str.charAt(i))){
				ctbranco++;
			}
			// verificando se é um caractere numérico
			if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9')){
			ctnum = ctnum + 1;
			}
		}
		System.out.printf("O numero de caracteres maiusculos e de %d \nO numero de caracteres minusculos e de %d"
				+ "\nO numero de carcteres numericos e de %d\nO numero de espacos e de %d",ctmaius, ctminus, ctnum, ctbranco );

	}//chave do public static void main

}//chave da classe Exercicio3
