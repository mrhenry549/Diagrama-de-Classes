package exercicios070616;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	
	Scanner s = new Scanner(System.in);
	
	public Treino() {
		exercicio1();
		exercicio2();
		exercicio3();
	}

	private void exercicio1() {
		System.out.println("introduza o 1� n�mero: ");
		int num1 = s.nextInt();

		System.out.println("introduza o 2� n�mero: ");
		int num2 = s.nextInt();

		if (num1 > num2)
			System.out.println("o n�mero maior � o PRIMEIRO");
		else
			System.out.println("o n�mero maior � o SEGUNDO");
	}

	private void exercicio2() {
		System.out.println("introduza o 1� n�mero: ");
		int num1 = s.nextInt();

		System.out.println("introduza o 2� n�mero: ");
		int num2 = s.nextInt();

		System.out.println("introduza o 2� n�mero: ");
		int num3 = s.nextInt();

		if (num1 > num2 && num1 > num3)
			System.out.println("o n�mero maior � o PRIMEIRO");
		else if (num2 > num1 && num2 > num3)
			System.out.println("o n�mero maior � o SEGUNDO");
		else
			System.out.println("o n�mero maior � o TERCEIRO");
	}

	private void exercicio3() {
		int tentativas = 5;

		int rand = (new Random()).nextInt(5) + 1;

		for (int i = 0; i < 5; i++) {
			System.out.println("Introduza um n�mero aleat�rio entre 1 e 5 (tem " + tentativas + " tentativas)");

			int num = s.nextInt();
			if (num < 1 || num > 5) {
				System.out.println("N�MERO INV�LIDO");
				i--;
			} else {
				if (num == rand) {
					System.out.println("Acertou no n�mero � " + (i + 1) + "� tentativa!");
					break;
				} else {
					System.out.println((i + 1) + "� tentativa");
					tentativas--;
				}
			}
		}

	}
}
