package logica.exercicios.aula10;

public class OperacoesMatematicas {
//	▪ Crie uma classe com um nome qualquer com o método main() padrão.
//	▪ Crie uma classe com o nome “OperacoesMatematicas” sem método main por padrão.
//	▪ Crie essas duas classes no mesmo pacote.
//	▪ Na classe OperacoesMatematicas, crie um método que receba como parâmetro a
//	operação (+, -, *, /) e dois números. Esse método deve chamar a função
//	correspondente a sua operação e retornar o resultado.
//	▪ Além disso, na classe OperacoesMatematicas, você deve criar os métodos para cada
//	operação. Esses métodos não podem ser acessados fora da classe
//	OperacoesMatematicas
//	▪ Na classe com o método main(), chame o método da classe OperacoesMatematicas
//	passando como parâmetro a operação desejada e dois números. Exiba o resultado.

	
	public static double operacao (char op, double num1, double num2) {
		switch(op) {
		case '+':
			return somar(num1, num2);

		case '-': 
			return (num1 - num2);
		case '*':
			return (num1 * num2);
		case '/':
			return (num1 / num2);
		}
		return - 1;
	}
	
	private static double somar(double a, double b) {
	return a+b;
	}
}
