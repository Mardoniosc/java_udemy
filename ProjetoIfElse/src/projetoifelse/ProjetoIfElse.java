package projetoifelse;

public class ProjetoIfElse {

	public static void main(String[] args) {

		// somente if
		int a = 10;
		// testar uma condi��o
		
		if(a == 10) {
			System.out.println("A � igual a 10");
		}
		if(a == 11) {
			System.out.println("A � igual a 11");
		}
		// com if e else
		
		String nome = "Carlos";
		if (nome == "Carlos" || nome=="Carloss") {//se for igual a cartlos
			System.out.println("Nome igual Carlos");
		}
		else {
			System.out.println("N�o � Carlos");
		}
		
		int valor1 = 1;
		int valor2 = 2;
		
		if (valor1 > valor2) {
			System.out.println("Valor1 � maior");
		}
		else {
			System.out.println("Valor2 � maior");
		}
		
	}

}
