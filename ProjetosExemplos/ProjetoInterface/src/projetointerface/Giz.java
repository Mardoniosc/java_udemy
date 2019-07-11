package projetointerface;

public class Giz implements IEscrever{

	private String cor;
	
	//contrutor
	public Giz(String cor) {
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
