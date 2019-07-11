/*---------------------------------------------------------------------------------------
 * Classe: ClassePessoa
 * Objetivo: Classe responsável pelo cadastro de pessoasl
 * Data criação: 04/06/2019
 * Desenvolvedor: Mardonio S Costa
 * Data atualização: 04/06/2019
 * desenvolvedor que atualizou: Mardonio S Costa 
 ----------------------------------------------------------------------------------------*/

//pacotes
package projetoclasses;

// importes
import java.util.Date;

// inicio classe pessoa
public class ClassePessoa {

	//atributos
	//----------------------------------------------------------------------------------
	private String nome;
	private String sobrenome;
	private int idadde;
	private double altura;
	private float peso;
	private Date dataNascimento;
	private String cpf;
	private String rg;
	private String nacionalidade;
	private String naturalidade;
	private String logradouro;
	private String endereco;
	private int numero;
	private String cep;
	private String bairro;
	private String complemento;
	private String cidade;
	private String estado;
	private String telefone;
	private String celular;
	private String email;
	private String observacoes;
	//----------------------------------------------------------------------------------
	
	//metódos get e set
	//get retorna o valor atribuido a variável
	//set atribui caso não tenha valor a variavel e se ja possui valor modifica
	//----------------------------------------------------------------------------------
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
	public int getIdadde() {
		return idadde;
	}
	public void setIdadde(int idadde) {
		this.idadde = idadde;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	//----------------------------------------------------------------------------------
	
	
}//fim classe pessoa
