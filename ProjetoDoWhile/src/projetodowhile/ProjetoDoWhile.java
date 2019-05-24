package projetodowhile;

public class ProjetoDoWhile {

	public static void main(String[] args) {
		
		//Estrutura de repetição do while
		
		int contador = 0;
		
		do {
			System.out.println("Repetição de numero: " + contador);
			contador++;
		} while (contador <=1);
		
		// execicio de comparação
		int i = 0;
		
		System.out.println("Estrutura while");
		while (i < 5) {
			System.out.println("interação: " + i++);	
		}
		i = 0;
		System.out.println("Estrutura do while");
		do {
			System.out.println("Interação: " + i++);
		} while (i < 5);
	}

}
