package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise67 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type a integer: ");
		int integer = sc.nextInt();
		System.out.println("Count: ");
		for (int n = 0; n < integer; n++) {
			System.out.print(n + ", ");
		}
		System.out.println("END!");
		sc.close();
	}
}
/*
 * 67) Faça um programa usando a estrutura “para” que leia um número inteiro
 * positivo e mostre na tela uma contagem de 0 até o valor digitado: Ex: Digite
 * um valor: 9 Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM!
 */