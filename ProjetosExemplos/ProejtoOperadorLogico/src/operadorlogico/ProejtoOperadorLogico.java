package operadorlogico;

public class ProejtoOperadorLogico {

	public static void main(String[] args) {

		int a = 10;
		int b = 12;
		
		// operador logico ||
		if (a == 10 || b != 15) {
			System.out.println("Correto!");
		}
		
		//operador logico &&
		if (a == 10 && b == 15) {
			System.out.println("Correto+");
		}
		
		boolean c = true;
		
		if(!c) {
			System.out.println("Verdadeiro");
		}
		
		
	}

}
