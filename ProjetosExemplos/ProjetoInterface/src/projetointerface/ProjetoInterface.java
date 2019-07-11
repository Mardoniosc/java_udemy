package projetointerface;

public class ProjetoInterface {

	public static void main(String[] args) {

		Caneta caneta = new Caneta("Azul");
		Lapis lapis = new Lapis("Preto");
		Giz giz = new Giz("Verde");
		
		System.out.println("A caneta tem a cor: " + caneta.cor());
		caneta.escrever("Este � o texto escrito pela caneta");
		System.out.println("O lapis tem a cor: " + lapis.cor());
		lapis.escrever("Este � o texto escrito pelo lapis");
		System.out.println("O giz tem a cor: " + giz.cor());
		giz.escrever("Este � o texto escrito pelo giz");
		
	}

}
