package logica.exercicos.aula05;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
//		Montar um script onde o usuário entre com o valor em Reais e faça a sua respectiva
//		conversão para:
//		▪ Dólar Americano – Euro - Peso Argentino - Libra Esterlina - Iene
//		▪ Exibir na tela todos os valores obtidos com apenas 02 casas decimais.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre com um valor em reais: ");
		float real = Float.parseFloat(scanner.nextLine());
		
		double dolar = (real * 5.63);
		double euro =(real * 6.23);
		double peso = (real * 0.0059);
		double libra = (real * 7.41);
		double iene = (real * 0.039);
		
		System.out.println("O valor em \n Dolar americano %.2d \n Euro %.2d"
				+ " \n Peso argentino %.4d \n Libra esterlina %.2d \n Iene %.3d" + dolar + euro + peso + libra +iene );
		scanner.close();
		

	}

}
