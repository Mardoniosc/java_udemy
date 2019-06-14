package projetopolimorfismo;

public class ProjetoPolimorfismo {

	public static void main(String[] args) {

		// instanciar as classes
		
		Rato r = new Rato();
		Elefante e = new Elefante();
		
		r.locomove();//vem da classe animal
		r.mama();//vem da classe mamifero
		r.obterCotaDiariaDeLeite();//vem da classe rato	
		
		e.obterCotaDiariaDeLeite();
		
	}

}
