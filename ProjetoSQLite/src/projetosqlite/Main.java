package projetosqlite;

import conexoes.Conexao;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException {

		// instanciar a classe conexão e criar TabelaPessoaFisica
		
		CriarTabelaPessoFisica criarpf = new CriarTabelaPessoFisica();
		Conexao con = new Conexao();
		// instanciar a classe inserir pessoa fisica
		InserirPessoaFisica inserirpf = new InserirPessoaFisica();
		
		con.conectar();
		
		criarpf.criarTabela();// criar a tabela pessoa fisica
		System.out.println("Criar a tabela\n");
		//inserir registros na tabela pessoa
		inserirpf.inserirDados("Mardonio", "Costa", "014.014.014-10");
		inserirpf.inserirDados("Maria", "Santos", "011.011.011-14");
		
		
		con.desconectar(); // desconectar
		
		
		
	}

}
