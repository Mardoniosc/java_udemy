package projetoheranca;

public class ProjetoHeranca {
	
	//metodo principal Main
	public static void main(String[] args) {
		
//		Automovel c = new Automovel();
//		c.getMarca(); // classe Automovel
//		c.getModelo();// classe Automovel
		
		Carro hc = new Carro();
		hc.getAno();// classe ClasseCarro
		hc.getPlaca();// classe ClasseCarro
		
		hc.getMarca();// classe Automovel
		hc.getModelo();// classe Automovel
		
		Caminhao ca = new Caminhao();
		ca.getNumeroEixos();//classe ClasseCaminhao
		ca.getPlaca();//classe ClasseCaminhao
		ca.getAno();//classe ClasseCaminhao
		ca.getMarca();// classe Automovel
		ca.getModelo();// classe Automovel
		
		Carro pc = new Carro();
		pc.getAno();// classe ClasseCarro
		pc.getMarca();// classe Automovel
		pc.getModelo();// classe Automovel
		pc.getPlaca();// classe ClasseCarro
		pc.getValorCarro();
		
	}

}
