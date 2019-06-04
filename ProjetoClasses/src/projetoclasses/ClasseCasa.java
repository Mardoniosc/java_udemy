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
	
	// get e set
	
	public float getAreaTerreno() {
		return areaTerreno;
	}

	public void setAreaTerreno(float areaTerreno) {
		this.areaTerreno = areaTerreno;
	}

	public float getAreaContruida() {
		return areaContruida;
	}

	public void setAreaContruida(float areaContruida) {
		this.areaContruida = areaContruida;
	}

	public String getTipoContrucao() {
		return tipoContrucao;
	}

	public void setTipoContrucao(String tipoContrucao) {
		this.tipoContrucao = tipoContrucao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}

	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}

	public int getQuantidadeBanheiros() {
		return quantidadeBanheiros;
	}

	public void setQuantidadeBanheiros(int quantidadeBanheiros) {
		this.quantidadeBanheiros = quantidadeBanheiros;
	}

	public boolean isTemGaragem() {
		return temGaragem;
	}

	public void setTemGaragem(boolean temGaragem) {
		this.temGaragem = temGaragem;
	}

	public float getAreaGaragem() {
		return areaGaragem;
	}

	public void setAreaGaragem(float areaGaragem) {
		this.areaGaragem = areaGaragem;
	}

	public String getTipoTelhado() {
		return tipoTelhado;
	}

	public void setTipoTelhado(String tipoTelhado) {
		this.tipoTelhado = tipoTelhado;
	}
	
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
