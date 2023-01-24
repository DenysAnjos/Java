package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0, media = 0, numberAge = 0, over21 = 0;
		String checker = "y";
		do {
			System.out.print("Age? ");
			age = sc.nextInt();
			numberAge++;
			media += age;
			if (age > 21) {
				over21++;
			}
			System.out.print("Do you want continue?(y/n) ");
			checker = sc.next();
		} while (checker.equals("y") || checker.equals("Y"));

		sc.close();
		System.out.println("Number of ages: " + numberAge);
		System.out.println("Media of ages: " + (media / numberAge));
		System.out.println("Over 21: " + over21);
	}
}
/*
 * 62) Faça um programa usando a estrutura “faça enquanto” que leia a idade de
 * várias pessoas. A cada laço, você deverá perguntar para o usuário se ele quer
 * ou não continuar a digitar dados. No final, quando o usuário decidir parar,
 * mostre na tela: a) Quantas idades foram digitadas b) Qual é a média entre as
 * idades digitadas c) Quantas pessoas tem 21 anos ou mais.
 */