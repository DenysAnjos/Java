package exercises.one.to.a.hundred;

import java.util.Arrays;

public class Exercise71 {

	public static void main(String[] args) {
		int vetor[] = new int[10];
		Arrays.fill(vetor, 999);
		for (int n : vetor) {
			System.out.print(n + " ");
		}
	}
}
/*
 * 71) Fa�a um programa que preencha automaticamente um vetor num�rico com 8
 * posi��es, conforme abaixo: 999 999 999 999 999 999 999 999 0 1 2 3 4 5 6 7
 */