package projetointerface;

public class Lapis implements IEscrever{

	private String cor;
	
	//criando um contrutor
	
	public Lapis(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void escrever(String texto) {

		System.out.println("Escrevendo o texto: " + texto);
	}

	@Override
	public String cor() {
		// TODO Auto-generated method stub
		return cor;
	}

}
