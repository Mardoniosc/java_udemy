package projetodowhile;

public class ProjetoDoWhile {

	public static void main(String[] args) {
		
		//Estrutura de repeti��o do while
		
		int contador = 0;
		
		do {
			System.out.println("Repeti��o de numero: " + contador);
			contador++;
		} while (contador <=1);
		
		// execicio de compara��o
		int i = 0;
		
		System.out.println("Estrutura while");
		while (i < 5) {
			System.out.println("intera��o: " + i++);	
		}
		i = 0;
		System.out.println("Estrutura do while");
		do {
			System.out.println("Intera��o: " + i++);
		} while (i < 5);
	}

}
