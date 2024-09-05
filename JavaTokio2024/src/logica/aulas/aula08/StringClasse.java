package logica.aulas.aula08;

public class StringClasse {

	public static void main(String[] args) {

		String str = "FIAP Paulista";
		
		int tamanhoStr = str.length();
		
		System.out.println(tamanhoStr); // Lengh() mostra o tamanho da string
		
		System.out.println(str.charAt(6)); // nomeDaString.charAt(posição que queremos) serve para mostrar a letra da posição escolhida
		
		System.out.println("----------------------------------");
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		System.out.println(str.charAt(4));
		System.out.println(str.charAt(5));
		
		System.out.println("----------------------------------");
		
		//Inves de fazer 10 milhoes de sysout, faça um laço for
		
		for (int i = 0; i < 13; i++) {
			System.out.println(str.charAt(i));
		}
		
	}

}
