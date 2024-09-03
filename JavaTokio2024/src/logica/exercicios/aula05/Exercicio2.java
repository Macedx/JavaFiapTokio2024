package logica.exercicios.aula05;

public class Exercicio2 {

	public static void main(String[] args) {
		
		
		//Declaração de int, float e double atribuindo valores
		int numInt = 1;
		float numFloat = 1.555f;
		double numDouble = 15.55;
		
		//Exiba os valores como números
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
		
		System.out.printf("%d %.2f %.2f \n", numInt, numFloat, numDouble);
		
//		System.out.println(num1 + " " + num2 + " " + num3);
//		deve-se usar % para formatar a quantidade de casas decimais

		//Converta int, float e double para string
		String numIntStr = Integer.toString(numInt);
		String numFloatStr = Float.toString(numFloat);
		String numDoubleStr = Double.toString(numDouble);

		System.out.printf("%s %s %s",numIntStr, numFloatStr, numDoubleStr);
		
	}

}
