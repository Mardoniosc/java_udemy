package projetotiposvariaveis;

public class ProjetoTiposVariaveis {

	public static void main(String[] args) {
		
		//tipos de variaveis primitivas
		
		//tipos inteiros
		
		int numero1 = 1234;
		System.out.println(numero1);
		short numero2 = 4523;
		byte numero3 = 127;
		long numero4 = 6546542;
		
		//converter inteiro por inteiro
		int converter1 = numero2; //Converteu normalmente
		int converter2 = (int)numero4;//necessitou de cast
		byte converter3 = (byte)numero4;//necessitou de cast
		
		//tipo caracter
		char valorchar = 'a';
		int converter4 = valorchar;
		System.out.println(converter4);
		
		System.out.println(valorchar);
		
		//tipos flutuantes
		float numero5 = 4.123f;
		double numero6 = 45.656585;
		System.out.println(numero5);
		
		
		//tipo booleano = verdadeiro ou falso
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro);
		
		
		//Tipos de variaveis não primitivas - são objetos
		String frase = "Curso Java";
		Float numero7 = 4.52f;
		Double numero8 = 4.52;
		
		System.out.println(numero8 + numero8);
		System.out.println(numero8.toString() +" "+ numero8.toString());
		
		//constantes
		final double pi = 3.14;
		System.out.println(pi);
		
	}

}
