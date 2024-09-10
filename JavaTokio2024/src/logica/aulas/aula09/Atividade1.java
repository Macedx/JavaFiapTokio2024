package logica.aulas.aula09;

public class Atividade1 {

	public static void main(String[] args) {

//		▪ Dado um conjunto de nomes de pessoas, escreva um algoritmo que imprima todas as
//		possíveis duplas que podem ser formadas.
//		▪ Primeiro, crie um vetor e coloque alguns nomes nele.
//		▪ A seguir, exiba as possíveis duplas.
		
		String nomes[] = {"Ana", "Bia", "Rodrigo", "Bruno"};
		
		String nomeTemporario = nomes[0];
		
		for (int i = 1; i < nomes.length; i++ ) {
			System.out.println(nomeTemporario + ", " + nomes[i]);
		}
		
		
	}

}
