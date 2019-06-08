package projetoheranca2;

public class Filha extends Pai{

	private String nomeFilha;
	
	public Filha(String nomeFilha) {
		this.nomeFilha = nomeFilha;
	}
	
	//@override - sobrescreve o metodo da classe Pai
	@Override
	public void nome() {
		System.out.println("O nome da filha é " + nomeFilha + ".");
	}
	
}
