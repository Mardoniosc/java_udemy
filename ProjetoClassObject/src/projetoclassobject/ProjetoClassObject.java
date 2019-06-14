package projetoclassobject;

public class ProjetoClassObject {

	public static void main(String[] args) {
		
		ClasseA classe_a = new ClasseA();
		ClasseB classe_b = new ClasseB();

		//metodo getClass que pertence ao objeto object
		System.out.println("");
		System.out.println(" getClasse() da classeA : " + classe_a.getClass());
		System.out.println(" getClasse() da classeB : " + classe_b.getClass());
		System.out.println("");
		
		// metodo clone() retorna uma copia do objeto
		ClasseA classe_c = (ClasseA) classe_a.clone();
		System.out.println("");
		System.out.println("classe_c é um clone da classeA? " + classe_c.equals(classe_a));
		System.out.println("getClass() da ClasseA clonado no objeto classe_c: " + classe_c.getClass());
		System.out.println("");
		
		//toString() retorna uma string do pacote com o nome da classe e um hexadecimal do obejto em questão
		System.out.println(" toString() da classe_a: " + classe_a.toString());
		System.out.println(" toString() da classe_b: " + classe_b.toString());
		System.out.println(" toString() da classe_c: " + classe_c.toString());
		System.out.println("");

	}

}
