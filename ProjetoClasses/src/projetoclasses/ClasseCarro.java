package projetoclasses;

public class ClasseCarro {
	
	// atributos
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private int numeroMarcha;
	private int anoFabricacao;
	private int anoModelo;
	private boolean motorLigado = false;
	private String numeroChassi;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroMarcha() {
		return numeroMarcha;
	}

	public void setNumeroMarcha(int numeroMarcha) {
		this.numeroMarcha = numeroMarcha;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public boolean isMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	public String getNumeroChassi() {
		return numeroChassi;
	}

	public void setNumeroChassi(String numeroChassi) {
		this.numeroChassi = numeroChassi;
	}

	//metodos
	public void ligarMotor() {
		if (motorLigado == false)
			motorLigado = true;
		else
			System.out.println("Motor já está ligado!");
	}

	public void desligarMotor() {
		if (motorLigado == true)
			motorLigado = false;
		else
			System.out.println("Motor já está desligado!");
	}

	public void acelerar() {
		
	}

	public void frear() {
		
	}
	public void aumentarMarcha() {
		int aumentar = 0;
		if (numeroMarcha == 5)
			System.out.println("Macha já na ultima");
		else
			aumentar++;
	}
	public void diminuirMarchar() {
		int diminuir = 5;
		if (numeroMarcha == 1){
			System.out.println("Macha já está na Primeira");
		}
		else
			diminuir--;
	}




}
