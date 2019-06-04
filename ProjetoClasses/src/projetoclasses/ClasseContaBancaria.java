package projetoclasses;

import java.math.BigDecimal;
import java.sql.Date;

public class ClasseContaBancaria {
	
	//atributos
	public String numeroConta;
	public int numeroAgencia;
	public int codigoClient;
	public BigDecimal saldoConta;
	public Date dataAberturaConta;
	
	// metodos get e set
	
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getNumeroAgencia() {
		return numeroAgencia;
	}
	public void setNumeroAgencia(int numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}
	public int getCodigoClient() {
		return codigoClient;
	}
	public void setCodigoClient(int codigoClient) {
		this.codigoClient = codigoClient;
	}
	public BigDecimal getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(BigDecimal saldoConta) {
		this.saldoConta = saldoConta;
	}
	public Date getDataAberturaConta() {
		return dataAberturaConta;
	}
	public void setDataAberturaConta(Date dataAberturaConta) {
		this.dataAberturaConta = dataAberturaConta;
	}
	//metodos
	public void dataAbertura() {
		
	}
	public void sacar() {
		
	}
	public void depositar() {
		
	}
	public void saldoConta() {
		
	}
	

}
