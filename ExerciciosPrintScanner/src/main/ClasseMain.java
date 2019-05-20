package main;

import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("----------------------------------");
		System.out.println("Calculo da Área do Retângulo");
		System.out.println("----------------------------------");
		System.out.println("Digite o lado A do retângulo: ");
		float ladoA = entrada.nextFloat();
		System.out.println("----------------------------------");
		System.out.println("Digite o lado B do retângulo: ");
		float ladoB = entrada.nextFloat();
		System.out.println("----------------------------------");
		float area = ladoA * ladoB;
		System.out.println("A área do retângulo é: " + area);
		
		
	}

}
