package projetoclasses;

public class ClasseCarro {
	
	// atributos
	
	public String marca;
	public String modelo;
	public String placa;
	public String cor;
	public int numeroMarcha;
	public int anoFabricacao;
	public int anoModelo;
	public boolean motorLigado = false;
	
	//metodos
	public void ligarMotor() {
		if (motorLigado == false)
			motorLigado = true;
		else
			System.out.println("Motor j� est� ligado!");
	}

	public void desligarMotor() {
		if (motorLigado == true)
			motorLigado = false;
		else
			System.out.println("Motor j� est� desligado!");
	}

	public void acelerar() {
		
	}

	public void frear() {
		
	}
	public void aumentarMarcha() {
		int aumentar = 0;
		if (numeroMarcha == 5)
			System.out.println("Macha j� na ultima");
		else
			aumentar++;
	}
	public void diminuirMarchar() {
		int diminuir = 5;
		if (numeroMarcha == 1){
			System.out.println("Macha j� est� na Primeira");
		}
		else
			diminuir--;
	}




}
