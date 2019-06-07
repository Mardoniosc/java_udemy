package projetoheranca;

public class Caminhao extends Automovel{

		// atributos
		private int ano;
		private String placa;
		private int numeroEixos;
		
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
		public int getNumeroEixos() {
			return numeroEixos;
		}
		public void setNumeroEixos(int numeroEixos) {
			this.numeroEixos = numeroEixos;
		}	
	
}
