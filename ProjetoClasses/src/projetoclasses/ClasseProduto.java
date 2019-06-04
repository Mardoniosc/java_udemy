package projetoclasses;

import java.math.BigDecimal;

public class ClasseProduto {

	//metodos
	public int codigo;
	public String nome;
	public BigDecimal preco;
	public String[] ingredientes;
	
	// get e set
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public String[] getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public void inserirProduto() {
		
	}
	public void deletarProduto() {
		
	}
	public void alterarProduto() {
		
	}
}
