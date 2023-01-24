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
 * 62) Fa�a um programa usando a estrutura �fa�a enquanto� que leia a idade de
 * v�rias pessoas. A cada la�o, voc� dever� perguntar para o usu�rio se ele quer
 * ou n�o continuar a digitar dados. No final, quando o usu�rio decidir parar,
 * mostre na tela: a) Quantas idades foram digitadas b) Qual � a m�dia entre as
 * idades digitadas c) Quantas pessoas tem 21 anos ou mais.
 */