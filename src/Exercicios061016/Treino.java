package Exercicios061016;

public class Treino {

	public Treino() {
		System.out.println(exercicio2());
	}

	private void exercicio1() {
		int pontosLeixoes = 45;
		int pontosFeirense = 76;
		int pontosPorto = 33;
		int pontosAves = 67;
	}

	private int exercicio2() {
		int[] pontosFora = new int[] { 45, 76, 33, 67 };
		int soma = 0;

		System.out.println("O valor da posi��o 3 �: " + pontosFora[2]);

		for (int i = 0; i < pontosFora.length; i++) {
			soma = soma + pontosFora[i];
		}

		return soma;

	}

}
