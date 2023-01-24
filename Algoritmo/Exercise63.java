package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise63 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String checker = "y";
		int numbers, sum = 0, smaller = 0, media = 0, pair = 0;
		do {
			System.out.println("Type a number: ");
			numbers = sc.nextInt();
			sum += numbers;
			media++;
			if (smaller == 0) {
				smaller = numbers;
			}
			if (numbers < smaller) {
				smaller = numbers;
			}
			if (numbers % 2 == 0) {
				pair++;
			}
			System.out.print("Do you want continue?(y/n) ");
			checker = sc.next();
		} while (checker.equals("y") || checker.equals("Y"));
		System.out.println("Sum: " + sum);
		System.out.println("Smaller: " + smaller);
		System.out.println("Media: " + (sum / media));
		System.out.println("Pairs numbers: " + pair);
		sc.close();
	}

}
/*
 * 63) Crie um programa usando a estrutura “faça enquanto” que leia vários
 * números. A cada laço, pergunte se o usuário quer continuar ou não. No final,
 * mostre na tela: a) O somatório entre todos os valores b) Qual foi o menor
 * valor digitado c) A média entre todos os valores d) Quantos valores são pares
 */