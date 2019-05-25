package projetometodospassagemvalor;

import java.util.Scanner;

public class ProjetoMetodosPassagemValor {
	
	// é o metodo main
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
					Mensagem("Digite um número inteiro: ");
					int a = entrada.nextInt();
					Mensagem("Digite outro número inteiro:");
					int b = entrada.nextInt();
					int valor = Somar(a,b);
					Mensagem("O valor da soma dos dois numeros é " + Integer.toString(valor));
				}
				
				else if(escolha == 2){
					Mensagem("Digite um número inteiro: ");
					int a = entrada.nextInt();
					Mensagem("Digite outro número inteiro:");
					int b = entrada.nextInt();
					int valor = Subtrair(a,b);
					Mensagem("O valor da subtração dos dois numeros é " + Integer.toString(valor));
				}
			}
		}
		
		// criar um metodo void que não retorna valores
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
