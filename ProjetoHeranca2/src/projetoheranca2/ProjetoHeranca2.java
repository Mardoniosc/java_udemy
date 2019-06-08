package projetoheranca2;

public class ProjetoHeranca2 {

	public static void main(String[] args) {

		Pai p = new Pai();
		Filha f = new Filha("Maria");
		
		p.nome();// foi criado o metodo nome na classe Pai
		System.out.println("\n");
		f.nome();// foi usado o mesmo metodo, ou seja sobrescrito pelo @overide
	}

}
