package projetooperadorternario;

public class ProjetoOperadorTernario {

	public static void main(String[] args) {

		// o operador ternario � a mesma coisa que if e else
		// so que � de uma maneira resumida
		
		int a = 1;
		int b = 2;
		
		// if e else normal
		if(a>b) 
			System.out.println("A � maior");
		else 
			System.out.println("B � maior");
		
		// operador ternario ?
		System.out.println(a > b ? "A � maior":"B � maior");
		
		String c = (a > b ? "Verdadeiro" : "False");
		System.out.println(c);
		
		//operadores logicos e relacionais
		double salario = 570;
		if (salario < 500)
			salario += 50;
		else if(salario >= 500 && salario < 600)
			salario += 100;
		else if ((salario >= 600) && (salario < 700))
			salario += 110;
		else
			salario += 250;
		
		System.out.println(salario);
	}

}
