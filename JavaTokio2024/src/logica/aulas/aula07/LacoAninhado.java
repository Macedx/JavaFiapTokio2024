package logica.aulas.aula07;

public class LacoAninhado {

	public static void main(String[] args) {

		for (int i = 0; i <= 3 ; i++) { 
//			variavel iniciadora (i começa valendo 0), 
//			até onde eu quero exibir (até 3),
//			de quantos em quantos vai pulando (i++, pula de 1 em 1)
	
			for (int j = 0; j <= 2; j+=2) {
				
				System.out.printf("%d, %d \n", i, j);
				
			}
		}
	}
}


