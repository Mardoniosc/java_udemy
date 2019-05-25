package projetopassagemarray;

public class ProjetoPassagemArray {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		ExibirArray(a);
		
		String[] cadastro = {"Nome","Sobrenome"};
		ExibirNome(cadastro);
		ExibirSobrenome(cadastro);
		
	}
	
	public static void ExibirArray(int[] x) {
		System.out.println(x[0]);
	}
	
	public static void ExibirNome(String[] x) {
		System.out.println(x[0]);
	}
	public static void ExibirSobrenome(String[] y) {
		System.out.println(y[1]);
	}
	

}
