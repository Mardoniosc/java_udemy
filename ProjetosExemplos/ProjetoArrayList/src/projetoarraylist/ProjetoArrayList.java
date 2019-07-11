package projetoarraylist;

import java.util.ArrayList;

public class ProjetoArrayList {

	public static void main(String[] args) {

		String empresa1 = "Casa do Queijo";
		String empresa2 = "Casa da Carne";
		String empresa3 = "Varejão das Frutas";
		
		ArrayList<String> empresas = new ArrayList<>();
		
		empresas.add(empresa1);//aidionando as strings
		empresas.add(empresa2);
		empresas.add(empresa3);
		
		System.out.println(empresas);
		System.out.println(empresas.size());//tamanho da arrayList
		
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		
		ArrayList<Integer> abc = new ArrayList<>();
		abc.add(a);
		abc.add(b);
		abc.add(c);
		
		System.out.println(abc);
		
		abc.remove(a);
		
		System.out.println(abc);
		
		String nome = "Mardonio";
		String sobrenome = "Costa";
		
		ArrayList<String> nomeSobrenome = new ArrayList<>();
		
		nomeSobrenome.add(nome);
		nomeSobrenome.add(sobrenome);
		
		System.out.println(nomeSobrenome.set(0, nome));
		
		for (String empre : empresas) {
			System.out.println("Empresa: " + empre);
		}
		
		empresas.clear();
		System.out.println(empresas);
	}

}
