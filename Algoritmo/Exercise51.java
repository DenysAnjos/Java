package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int biggest = 0;
		System.out.println("Type a price:");
		int price = sc.nextInt();
		int lowest = price;
		while (n < 7) {
			System.out.println("Type a price: ");
			price = sc.nextInt();
			if (price > biggest) {
				biggest = price;
			}
			if (price < lowest) {
				lowest = price;
			}
			n++;
		}
		System.out.println("Biggest price: " + biggest);
		System.out.println("Lowest price: " + lowest);
		sc.close();
	}
}
/*
 * 51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na
 * tela qual foi o maior e qual foi o menor preço digitados
 */
