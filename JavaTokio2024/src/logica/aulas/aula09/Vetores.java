package logica.aulas.aula09;

public class Vetores {

	public static void main(String[] args) {

//		Lado esquerdo: Declaração de vetor de números inteiros
//		Lado direito: Instanciamos o vetor com 10 posições
		
//		VETOR INTEIRO
		
		int[] vetorInteiros = new int[10];
		
		vetorInteiros[0] = 10; // Colocando o valor 10 na posição 0 do vetor
		vetorInteiros[1] = 1999; //Colocando o valor 1999 na posição 1 do vetor
		
		System.out.println("Valor inteiro na posicao 0: " + vetorInteiros[0]);
		
		int anoNascimento = vetorInteiros[1];
		System.out.println("Ano nascimento: " + anoNascimento);
		
//		ACESSANDO A POSIÇÃO VIA VARIÁVEL
		int posicao = 0;
		System.out.println(vetorInteiros[posicao]);
		
//		-------------------------------------------------------------------------------
		
//		DECLARANDO UMA LISTA DE FRUTAS COM 4 POSIÇÕES
		String[] listaFrutas = new String[4];
		listaFrutas[0] = "Morango";
		listaFrutas[1] = "Uva";
		listaFrutas[2] = "Pera";
		listaFrutas[3] = "Tomate";
		
		System.out.println();
		System.out.println("Fruta na posicao 1: " + listaFrutas[1]);
		
		
//		OUTRO JEITO DE DECLARAR LISTAS
		
		String[] listaFrutas2 = {"Melancia", "Abacaxi", "Pitaia", "Banana"};
		
//		listaFrutas2[] = "Melancia"
//		listaFrutas2[] = "Abacaxi"
//		listaFrutas2[] = "Pitaia"
//		listaFrutas2[] = "Banana"
//		listafrutas.length = 4
								
				
		int qtdFrutas = listaFrutas2.length;
		System.out.println("Quantidade de frutas: " + qtdFrutas);
		
//		FOR INDEXADO
		for (int i = 0; i < listaFrutas2.length; i++) {
			System.out.println(listaFrutas2[i]);
		}
		
//		CRIAR UMA LISTA DE NUMEROS
		int[] numeros = {16, 24, 29, 33};
		
//		FOR EACH --> Percorre a lista e acessa os valores das posições
		System.out.println();
		
		for (int numero: numeros) {
			System.out.println(numero);
		}
		
		
	}

}
