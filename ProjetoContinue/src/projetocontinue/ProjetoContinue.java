package projetocontinue;

public class ProjetoContinue {

	public static void main(String[] args) {
		
		// comando break
		
		System.out.println("Entrou no for!");
		for (int i=0; i <= 15; i++) {
			if (i == 10 || i == 5) {
				System.out.println("Entrou no if e executou o continue");
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("Saiu do for!");
		
	}

}
