package projetometodos;// pacotes

public class ProjetosMetodos {//classe

	
	// � o metodo main
	public static void main(String[] args) {

		Mensagem();
		System.out.println(Passarvalor());
	}
	
	// criar um metodo void que n�o retorna valores
	static void Mensagem() {
		System.out.println("Estamos executando o metodo Mensagem()");
	}

	// criar um metodo int que retornora um valor inteiro sem passar valor
	static int Passarvalor() {
		int a = 1, b = 2, c = a + b;
		return c;
	}
}
