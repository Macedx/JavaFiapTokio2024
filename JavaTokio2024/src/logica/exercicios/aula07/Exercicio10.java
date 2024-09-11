package logica.exercicios.aula07;

public class Exercicio10 {

	public static void main(String[] args) {
//		▪ Determine e mostre todos os números primos no intervalo de 2 a 2000.
//
//		Dicas:
//		▪ Para resolver esse problema, primeiro faça um algoritmo que verifica se um número
//		inteiro qualquer é primo ou não.
//		▪ A seguir, com esse código em mãos, faça os ajustes necessários para mostrar todos os
//		números primos no intervalo solicitado.
//		▪ Você precisará colocar uma estrutura de repetição dentro da outra.
//		▪ Laços aninhados!!!!
		
		for (int numero = 2; numero <= 2000; numero++) {
			int divisor = 2;
			
//			Núemero primo: resto da divisão é 0, divisível por 1 e por ele mesmo
			
			while (numero % divisor != 0 ) {
//				System.out.printf("%d -- %d | tem resto, logo, nao e divisor\n", numero, divisor);
				divisor++;
			}
			
			if (divisor == numero) {
				System.out.printf ("%d e numero primo\n", numero);
			}

		}
		}
		
		


}
