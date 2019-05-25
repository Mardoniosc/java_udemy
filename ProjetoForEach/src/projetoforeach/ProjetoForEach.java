package projetoforeach;

public class ProjetoForEach {

	public static void main(String[] args) {

		int[] a = {1,2,3,4,5};
		String[] nome = {"Mardonio","Maria","Vaneide","Marileide","Manoel"};
		
		System.out.println(a[0]);
		System.out.println(a.length);
		
		for (int i = 0;i < nome.length ; i++)
			System.out.println(nome[i]);
		
		// for (each
		for (int i : a) {
			System.out.println(i);
		}
		
		for (String j : nome) {
			System.out.println(j);
		}
	}

}
