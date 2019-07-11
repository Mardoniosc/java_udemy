package projetosobrecarcametodos;

public class ProjetoSobrecarcaMetodos {

	public static void main(String[] args) {

		
		//ligar tv no canal 3
		System.out.println("Iniciou no canal: " + LigarTV());
		System.out.println(" ");
		//Escolher o canal que a tv irá iniciar
		System.out.println("Iniciou no canal: " + LigarTV(6));

		
	}
	
	public static int LigarTV() {
		int canal = 3;
		return canal;
	}

	public static int LigarTV(int a) {
		int canal = a;
		return canal;
	}
	
	public static int LigarTV(int a, boolean ligada) {
		if (ligada == true) {
			int canal = a;
			return canal;
		}
		else {
			ligada = true;
			int canal = a;
			return canal;
		}
		
	}

}
