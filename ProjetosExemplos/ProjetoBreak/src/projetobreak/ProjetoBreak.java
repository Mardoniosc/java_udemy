package projetobreak;

public class ProjetoBreak {

	public static void main(String[] args) {
		
		// comando break
		
		System.out.println("Entrou no for!");
		for (int i=0; i <= 15; i++) {
			if (i==5) {
				System.out.println("Entrou no if e executou o break");
				break;
			}
			System.out.println(i);
		}
		System.out.println("Saiu do for!");
		
	}

}
