package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise66 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.print("Type a number: ");
		number = sc.nextInt();
		for (int n = 1; n < 11; n++) {
			System.out.println(number + " x " + n + " = " + (n * number));
		}
		sc.close();
	}
}
/*
 * 66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
 * número, usando a estrutura “para”. Ex: Digite um valor: 5 5 x 1 = 5 5 x 2 =
 * 10 5 x 3 = 15 ...
 */