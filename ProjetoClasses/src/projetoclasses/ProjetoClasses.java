package projetoclasses;

public class ProjetoClasses {

	public static void main(String[] args) {

		
		ClasseCarro carro = new ClasseCarro();
		
		carro.setCor("Vermelho");
		carro.setNumeroChassi("ASDFASDF321654ASDF");
		System.out.println("O carro � " + carro.getCor());
		System.out.println(carro.getNumeroChassi());
	}

}
