package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a product value: ");
		double product = sc.nextDouble();
		System.out.println("The descounted product is: R$" +(product - product*5/100));
		sc.close();
	}

}
/*
12) Crie um programa que leia o pre�o de um produto, calcule e mostre o seu
PRE�O PROMOCIONAL, com 5% de desconto.
*/