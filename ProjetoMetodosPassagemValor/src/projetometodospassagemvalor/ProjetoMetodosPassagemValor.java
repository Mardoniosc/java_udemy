package projetometodospassagemvalor;

import java.util.Scanner;

public class ProjetoMetodosPassagemValor {
	
	// � o metodo main
		public static void main(String[] args) {

			Scanner entrada = new Scanner(System.in);
			String separador = ("\n-------------------------------------\n");
			
			while(true) {
				
				Mensagem(separador);
				Mensagem("Digite 1 para somar e 2 para subtrair e 0 para sair:");
				int escolha = entrada.nextInt();
				if (escolha == 0)
					break;
				if (escolha == 1) {
					Mensagem("Digite um n�mero inteiro: ");
					int a = entrada.nextInt();
					Mensagem("Digite outro n�mero inteiro:");
					int b = entrada.nextInt();
					int valor = Somar(a,b);
					Mensagem("O valor da soma dos dois numeros � " + Integer.toString(valor));
				}
				
				else if(escolha == 2){
					Mensagem("Digite um n�mero inteiro: ");
					int a = entrada.nextInt();
					Mensagem("Digite outro n�mero inteiro:");
					int b = entrada.nextInt();
					int valor = Subtrair(a,b);
					Mensagem("O valor da subtra��o dos dois numeros � " + Integer.toString(valor));
				}
			}
		}
		
		// criar um metodo void que n�o retorna valores
		static void Mensagem(String m) {
			System.out.println(m);
		}

		// criar um metodo int que retornora um valor inteiro sem passar valor
		static int Somar(int a, int b) {
			int c = a + b;
			return c;
		}
		
		static int Subtrair(int a, int b) {
			int c = a - b;
			return c;
		}

}
