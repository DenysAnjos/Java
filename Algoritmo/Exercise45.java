package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial value: ");
		int initial = sc.nextInt();
		System.out.println("Final value: ");
		int fina = sc.nextInt();
		System.out.println("Increment: ");
		int increment = sc.nextInt();
		System.out.print("Counting:");
		if (initial < fina) {
			while (initial < fina) {
				System.out.print(initial + " ");
				initial = initial + increment;
			}
			System.out.println("End!");

		} else {
			while (initial > fina) {
				System.out.print(initial + " ");
				initial = initial - increment;
			}
			System.out.println("End!");
			sc.close();
		}
	}
}
/*
 * 45) O programa acima vai ter um problema quando digitarmos o primeiro valor
 * maior que o último. Resolva esse problema com um código que funcione em
 * qualquer situação.
 */