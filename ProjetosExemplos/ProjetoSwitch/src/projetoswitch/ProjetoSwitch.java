package projetoswitch;

public class ProjetoSwitch {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		
		
		switch (a % b) {
		case 0:
			System.out.println("É par");
			break;

		case 1:
			System.out.println("É impar");
			break;
		}
		
		int idade = 20;
		
		switch (idade) {
		case 18:
			System.out.println("Tem 18");
			break;
		
		case 19:
			System.out.println("Tem 19");
			break;
		
		case 20:
			System.out.println("Tem 20");
			break;

		default:
			System.out.println("Não tem 18,19 e 20");
			break;
		}
	}

}
