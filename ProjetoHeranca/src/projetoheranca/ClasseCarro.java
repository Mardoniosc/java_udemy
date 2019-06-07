// classe que herdará da classe carro
package projetoheranca;

//para herdar da classe Carro usamos o extends
public class ClasseCarro extends Automovel{
	
	// atributos
	private int ano;
	private String placa;
	
	//metodos get e set
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}	
	
}
