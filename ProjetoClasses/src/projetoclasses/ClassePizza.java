package projetoclasses;

public class ClassePizza {
	
	//atributos
	private String formato;
	private String nome;
	private int quantidadePedaco;
	private String[] ingredientes;
	private int quantidadeSabores;
	private String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidadePedaco() {
		return quantidadePedaco;
	}
	public void setQuantidadePedaco(int quantidadePedaco) {
		this.quantidadePedaco = quantidadePedaco;
	}
	public String[] getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int getQuantidadeSabores() {
		return quantidadeSabores;
	}
	public void setQuantidadeSabores(int quantidadeSabores) {
		this.quantidadeSabores = quantidadeSabores;
	}
	
	
}
