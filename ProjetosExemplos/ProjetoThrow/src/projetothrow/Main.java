package projetothrow;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main {
	static int saque = 0;

	public static void main(String[] args) {

		saque();
		
	}
	
	public static void saque() {
		Scanner entradaSaque = new Scanner(System.in);
		System.out.println("Digite o valor desejado para o saque: ");
		saque = entradaSaque.nextInt();
		
		if (saque == 0) {
			throw new EmptyStackException();
		}
		
		if (saque > 400) {
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		} else {
			System.out.println("Valor retirado da conta R$ " + saque);
		}
	}

}
