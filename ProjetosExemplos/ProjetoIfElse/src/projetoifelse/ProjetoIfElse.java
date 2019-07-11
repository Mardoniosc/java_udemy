package projetoifelse;

public class ProjetoIfElse {

	public static void main(String[] args) {

		// somente if
		int a = 10;
		// testar uma condição
		
		if(a == 10) {
			System.out.println("A é igual a 10");
		}
		if(a == 11) {
			System.out.println("A é igual a 11");
		}
		// com if e else
		
		String nome = "Carlos";
		if (nome == "Carlos" || nome=="Carloss") {//se for igual a cartlos
			System.out.println("Nome igual Carlos");
		}
		else {
			System.out.println("Não é Carlos");
		}
		
		int valor1 = 1;
		int valor2 = 2;
		
		if (valor1 > valor2) {
			System.out.println("Valor1 é maior");
		}
		else {
			System.out.println("Valor2 é maior");
		}
		
	}

}
