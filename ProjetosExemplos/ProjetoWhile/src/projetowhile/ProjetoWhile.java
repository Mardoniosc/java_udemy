package projetowhile;

public class ProjetoWhile {

	public static void main(String[] args) {

		// estrutura de repeti��o while
		
		int contador = 0;
		
		while (contador <= 15){
			System.out.println("Repeti��o n�mero " + contador);
			contador++;
			
		}
		
		int x = 15;
		
		while (x <= 18) {
			if (x < 18)
				System.out.println("Voc� n�o tem permiss�o para entrar");
			else
				System.out.println("Voc� pode entrar");
			x++;
		}
		
	}

}
