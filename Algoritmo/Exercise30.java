package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type the segment 1: ");
		double seg1 = sc.nextDouble();
		System.out.println("Type the segment 2: ");
		double seg2 = sc.nextDouble();
		System.out.println("Type the segment 3: ");
		double seg3 = sc.nextDouble();

		if (seg1 < (seg2 + seg3) && seg2 < (seg1 + seg3) && seg3 < (seg1 + seg2)) {
			System.out.print("Is a ");
		if (seg1 == seg2 && seg2 == seg3) {
			System.out.print("equilateral triangle");
		} else if (seg1 + seg2 == seg2 * 2 || seg1 + seg3 == seg1 * 2 || seg2 + seg3 == seg3 * 2) {
			System.out.print("isosceles triangle");
		} else if (seg1 != seg2 && seg2 != seg3) {
			System.out.print("scalene triangle.");
		}} else {
			System.out.println("Is not a triangle");
		}
		sc.close();
	}
}
/*
 * 30) [DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que
 * tipo de triângulo será formado: - EQUILÁTERO: todos os lados iguais -
 * ISÓSCELES: dois lados iguais - ESCALENO: todos os lados diferentes
 */