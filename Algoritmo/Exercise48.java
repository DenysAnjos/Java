package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise48 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int total = 0;
		while (n < 7) {
			System.out.println("Number for sum: ");
			int sum = sc.nextInt();
			total = total + sum;
			n++;
		}
		System.out.println("Sum: " + total);
		sc.close();

	}

}
/*
 * 48) Fa�a um programa que leia 7 n�meros inteiros e no final mostre o
 * somat�rio entre eles
 */