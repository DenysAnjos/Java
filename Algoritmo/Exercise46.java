package exercises.one.to.a.hundred;

public class Exercise46 {

	public static void main(String[] args) {
		int n = 6;
		int sum = 0;
		while (n < 100) {
			System.out.print(n + " ");
			sum = sum + n;
			n = n + 2;
		}
		System.out.print("\nResult: " + sum);
	}

}
/*
 * 46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6
 * + 8 + 10 + 12 + 14 + ... + 98 + 100.
 */
