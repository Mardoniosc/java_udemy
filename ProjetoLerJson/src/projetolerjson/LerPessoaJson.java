package projetolerjson;

public class LerPessoaJson {
	
	private String nome;
	private String sobrenome;
	private String cidade;
	
	// vou sobreescrever o metodo toString()
	/**
	 * Retorna o Json em um formato toString
	 * @return
	 */
	@Override
	public String toString() {
		return "Pessoa {" + "nome = " + nome + ", sobrenome = " 
				+ sobrenome + ", Cidade = "  + cidade + "}";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
}
