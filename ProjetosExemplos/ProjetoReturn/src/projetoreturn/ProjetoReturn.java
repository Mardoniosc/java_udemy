package projetoreturn;

public class ProjetoReturn {

	public static void main(String[] args) {

		System.out.println("Reornou um numero inteiro " + Retorna());
		System.out.println("Retornou uma soma " + RetornaSoma());
		System.out.println("Retornou uma variavel " + RetornaVariavel());
		System.out.println("Retornou uma String " + RetornaString());
		System.out.println("Retournou uma concatenação de String " + RetornaString2("Mardonio ", "Costa"));
		
	}

	// metodo int
	
	public static int Retorna() {
		return 1;
	}
	
	public static int RetornaSoma() {
		return 1 + 5;
	}
	
	public static int RetornaVariavel() {
		int a = 100;
		return a;
	}
	
	// metodo string
	
	public static String RetornaString() {
		return "Mardonio";
	}
	
	public static String RetornaString2(String nome, String sobrenome) {
		return nome + sobrenome;
	}
}
