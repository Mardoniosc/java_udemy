package projetowhile;

public class ProjetoWhile {

	public static void main(String[] args) {

		// estrutura de repetição while
		
		int contador = 0;
		
		while (contador <= 15){
			System.out.println("Repetição número " + contador);
			contador++;
			
		}
		
		int x = 15;
		
		while (x <= 18) {
			if (x < 18)
				System.out.println("Você não tem permissão para entrar");
			else
				System.out.println("Você pode entrar");
			x++;
		}
		
	}

}
