package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a positive integer: ");
		int inte = sc.nextInt();
		int n = 0;
		while (n < inte) {
			n++;
			System.out.print(n + " ");

		}
		System.out.print("End!");
		sc.close();
	}

}
/*
 * 42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
 * qualquer e mostre uma contagem até esse valor: Ex: Digite um valor: 35
 * Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */