package projetofor;

public class ProjetoFor {

	public static void main(String[] args) {

		// estrutura for
		
		// incrementando
		for (int i=0;i<10;i++)
			System.out.println("Repetição de numero: " + i);
		
		System.out.println("------------------------------\n");
		
		// decrementando
		for (int j=10;j>0;j--)
			System.out.println("Falta " + j + " para finalizar o processo");
		
		// for dentro de outro for
		
		for(int i=0; i <= 4; i++) {
			System.out.println("I= " + i);
			for (int a = 4; a>=0 ; a--) {
				System.out.println("A= " + a);
			}
		}
		
	}

}