package logica.aulas.aula06;

public class VotoOpcional {

	public static void main(String[] args) {
		
		int idade = 71;
		
		boolean verificaMenorIdade = idade >= 16 && idade < 18;
		
		System.out.println("Voto opcional para menor de idade: " + verificaMenorIdade);
		
		boolean verificaIdoso = idade > 70;
		System.out.println("Voto opcional para idosos: " + verificaIdoso);
		
		if ((idade >= 16 && idade > 18)|| idade > 10){
			System.out.println("Voto opcional");
		}
	}

}
