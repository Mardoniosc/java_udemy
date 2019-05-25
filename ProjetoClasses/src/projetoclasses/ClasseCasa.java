package projetoclasses;

public class ClasseCasa {

	public float areaTerreno;
	public float areaContruida;
	public String tipoContrucao;
	public String cor;
	public int quantidadeQuartos;
	public int quantidadeBanheiros;
	public boolean temGaragem;
	public float areaGaragem;
	public String tipoTelhado;
	
	//métodos
	
	public void abrirPortaPrincipal() {
		
	}
	
	public void fecharPortaPrincipal() {
		
	}
	
	public void abrirPortaGaragem() {
		boolean abrir;
		if (temGaragem == true)
			abrir = true;
	}
	public void fecharPortaGaragem() {
		boolean fechar;
		if (temGaragem == true)
			fechar = true;
	}
	
	
}
