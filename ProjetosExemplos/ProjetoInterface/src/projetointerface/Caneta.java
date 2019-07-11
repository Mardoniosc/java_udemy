package projetointerface;

public class Caneta implements IEscrever{

	private String cor;
	
	// criar um construtor
	public Caneta(String cor) {
		this.cor = cor;
	}
	
	@Override
	public void escrever(String texto) {
		
		System.out.println("Escrevendo o texto: " + texto);
	}

	@Override
	public String cor() {
		return cor;
	}

}
