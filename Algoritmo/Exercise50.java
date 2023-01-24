package exercises.one.to.a.hundred;

import java.util.Random;
import java.util.Scanner;

public class Exercise50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		int n = 0;
		int above = 0;
		int check = 0;
		int divider = 0;
		System.out.println("Numbers drawn: ");
		while (n < 20) {
			check = generator.nextInt(10);
			System.out.print(check + " ");
			if (check > 5) {
				above++;
			}
			if (check % 3 == 0) {
				divider++;
			}
			n++;
		}
		System.out.println("\nAbove number 5: " + above);
		System.out.println("Divider of 3: " + divider);
		sc.close();
	}
}
/*
 * 50) Desenvolva um programa que fa�a o sorteio de 20 n�meros entre 0 e 10 e
 * mostre na tela: a) Quais foram os n�meros sorteados b) Quantos n�meros est�o
 * acima de 5 c) Quantos n�meros s�o divis�veis por 3
 */