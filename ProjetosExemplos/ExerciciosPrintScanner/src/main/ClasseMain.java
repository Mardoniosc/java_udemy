package main;

import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("Calculo da �rea do Ret�ngulo");
		System.out.println("------------------------------------------");
		System.out.println("Digite o lado A do ret�ngulo em cm: ");
		float ladoA = entrada.nextFloat();
		System.out.println("----------------------------------");
		System.out.println("Digite o lado B do ret�ngulo em cm: ");
		float ladoB = entrada.nextFloat();
		System.out.println("-------------------------------------------");
		float area = ladoA * ladoB;
		System.out.println("A �rea do ret�ngulo �: " + area + "cm");
		System.out.println("-------------------------------------------");
		System.out.println("Digite a profundidade do ret�ngulo em cm");
		float profundidade = entrada.nextFloat();
		float volume = area * profundidade;
		System.out.println("-------------------------------------------");
		System.out.println("O volume do ret�ngulo � " + volume + "cm�");
		
	}

}
