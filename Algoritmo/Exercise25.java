package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the segment 1: ");
		double seg1 = sc.nextDouble();
		System.out.println("Type the segment 2: ");
		double seg2 = sc.nextDouble();
		System.out.println("Type the segment 3: ");
		double seg3 = sc.nextDouble();

		if (seg1 < (seg2 + seg3) && seg2 < (seg1 + seg3) && seg3 < (seg1 + seg2)) {
			System.out.println("Is a triangle");
		} else {
			System.out.println("Is not a triangle");
		}
		sc.close();
	}
}
/*
 * 25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
 * Analise seus comprimentos e diga se é possível formar um triângulo com essas
 * retas. Matematicamente, para três segmentos formarem um triângulo, o
 * comprimento de cada lado deve ser menor que a soma dos outros dois
 */