package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a value: ");
		int value = sc.nextInt();
		System.out.println("Type another value: ");
		int value2 = sc.nextInt();
		System.out.println("The sum between " + value + " and " + value2 + " is equal to " + (value + value2) + ".");
		sc.close();
	}

}
/*
4) Desenvolva um algoritmo que leia dois n�meros inteiros e mostre o somat�rio
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 � igual a 13.
*/