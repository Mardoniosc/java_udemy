package projetoenum;

public class ProjetoEnum {

	public static void main(String[] args) {
		
		System.out.println(diasDaSemana.terca.getDiasDaSemana());
		System.out.println(quantidadeDiasDoMes.agosto.getQuantidadeDiasDoMes());
		
	}
	
	public enum diasDaSemana{
		domingo("Domingo"),
		segunda("Segunda-Feira"),
		terca("Terça-Feira"),
		querta("Quarta-Feira"),
		quinta("Quinta-Feira"),
		sexta("Sexta-Feira"),
		sabado("Sábado");
		
		private String valor;
		
		diasDaSemana(String valor){
			this.valor = valor;
		}
		
		public String getDiasDaSemana() {
			return this.valor;
		}
		
	}

	public enum quantidadeDiasDoMes{
		janeiro(31),
		fevereiro(28),
		marco(31),
		abril(30),
		maio(31),
		junho(30),
		julho(31),
		agosto(31),
		setembro(30),
		outubro(31),
		novembro(30),
		dezembro(31);
		
		private int dias;
		quantidadeDiasDoMes(int dias){
			this.dias = dias;
		}
		
		public int getQuantidadeDiasDoMes() {
			return this.dias;
		}
		
	}
	
}
