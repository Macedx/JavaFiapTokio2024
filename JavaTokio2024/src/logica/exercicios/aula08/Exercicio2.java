package logica.exercicios.aula08;

import java.util.Calendar;

public class Exercicio2 {

	public static void main(String[] args) {
//		▪ Faça um programa que verifica o dia da semana.
//		▪ Se for terça-feira, exiba ao usuário que terá feira de rua.
		
		Calendar c = Calendar.getInstance();
		if( c.get(Calendar.DAY_OF_WEEK) == 3) {
			System.out.println("Tera feira de rua!");
		}

	}

}
