package projetoclasses;

import java.util.Scanner;

public class ProjetoClasses {

	public static void main(String[] args) {

		// instanciar é o mesmo que referenciar
		//instanciar é criar um objeto
		
		//instanciando um objeto da classe Scanner do java, já criada
		Scanner entradaDados = new Scanner(System.in);
		// quando colocamos o system.in na realizdade estamos 
		//adicionando um comando obrigatorio no contrutor
		
		// Scanner entradaDados é uma variavel com o nome entradaDados do tipo Scanner
		// new Scanner é o contrutor da classe Scanne, ele é obrigatorio iniciar com System.in
		
		// instanciar um outro objeto da classe Scanner
		// o contrutor já recebera uma variavel com um valor atribuido
		
		String frase = "Olá Mundo!";
		
		Scanner entradaFrase = new Scanner(frase);
		System.out.println(entradaFrase.nextLine());
		
		// instaciamos nossas classes criadas e criamos um objeto para cada classe
		ClasseCarro carro = new ClasseCarro();
		ClasseCasa casa = new ClasseCasa();
		ClasseContaBancaria conta = new ClasseContaBancaria();
		ClasseIPTU iptu = new ClasseIPTU();
		ClassePessoa pessoa = new ClassePessoa();
		ClassePizza pizza = new ClassePizza();
		ClasseProduto produto = new ClasseProduto();
		ClasseRobo robo = new ClasseRobo();
		
		// criar mais objetos
		ClasseCarro carro1 = new ClasseCarro();
		ClasseCasa casa1 = new ClasseCasa();
		ClasseContaBancaria conta1 = new ClasseContaBancaria();
		ClasseIPTU iptu1 = new ClasseIPTU();
		ClassePessoa pessoa1 = new ClassePessoa();
		ClassePizza pizza1 = new ClassePizza();
		ClasseProduto produto1 = new ClasseProduto();
		ClasseRobo robo1 = new ClasseRobo();
		
		ClasseCarro carro2 = new ClasseCarro();
		ClasseCasa casa2 = new ClasseCasa();
		ClasseContaBancaria conta2 = new ClasseContaBancaria();
		ClasseIPTU iptu2 = new ClasseIPTU();
		ClassePessoa pessoa2 = new ClassePessoa();
		ClassePizza pizza2 = new ClassePizza();
		ClasseProduto produto2 = new ClasseProduto();
		ClasseRobo robo2 = new ClasseRobo();
		
		//atribuimos valores para o metodos set da ClasseCarro na variavel
		// private marca
		carro.setMarca("Fiat");
		carro1.setMarca("Volksvagen");
		carro2.setMarca("Chevrolet");
		
		
		
		
		
		
		
		
		
		
		/*		
		ClasseCarro carro = new ClasseCarro();
		
		carro.setCor("Vermelho");
		carro.setNumeroChassi("ASDFASDF321654ASDF");
		System.out.println("O carro é " + carro.getCor());

		System.out.println(carro.getNumeroChassi());
		*/
	}

}
