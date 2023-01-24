package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your name: ");
		String name = sc.nextLine();
		System.out.println("Type your sex (M) for man, (W) for woman: ");
		String sex = sc.nextLine();
		System.out.println("Type the purchase value: ");
		double value = sc.nextDouble();

		if (sex.equals("M") || sex.equals("m")) {
			System.out.println(name + ", your discounted is: 5% and total value is: " + (value - value * 5 / 100));
		} else {
			System.out.println(name + ", your discounted is: 13% and total value is: " + (value - value * 13 / 100));
		}
		sc.close();
	}
}
/*
 * 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
 * para todos, mas especialmente para mulheres. Faça um programa que leia nome,
 * sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
 * que: - Homens ganham 5% de desconto - Mulheres ganham 13% de desconto
 */