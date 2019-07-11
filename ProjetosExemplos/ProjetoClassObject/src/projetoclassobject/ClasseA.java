package projetoclassobject;

public class ClasseA extends Object{

	public String a;
	
	public ClasseA() {
		System.out.println("Objeto da classeA foi criado com sucesso!");
		this.a = "Oi, Sucesso!";
	}
	
	@Override // sobreescrever um metodo da classe object
	protected Object clone() {
		return this;
	}
	
	
}
