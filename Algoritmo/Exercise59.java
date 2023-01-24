package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise59 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String quest = "y", sex;
		int age, biggestAge = 0, numberM = 0, youngerW = 99, sumAgeM = 0;
		while (quest.equals("y") || quest.equals("Y")) {
			System.out.print("Type (M) for man and (W) for woman: ");
			sex = sc.next();
			System.out.print("Age: ");
			age = sc.nextInt();
			System.out.print("Do you want continue?(y/n) ");
			quest = sc.next();
			if (age > biggestAge) {
				biggestAge = age;
			}
			if (sex.equals("m") || sex.equals("M")) {
				numberM++;
			}
			if (sex.equals("w") || sex.equals("W") && age < youngerW) {
				youngerW = age;
			}
			if (sex.equals("m") || sex.equals("M")) {
				sumAgeM += age;
			}
			
			
		}
		System.out.println("Biggest age: " + biggestAge);
		System.out.println("Number men:" + numberM);
		System.out.println("Younger woman: " + youngerW);
		System.out.println("Age media between men: " + (sumAgeM / numberM));
		sc.close();
	}
}
/*
 * 59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa
 * vai perguntar se o usuário quer continuar ou não a cada pessoa. No final,
 * mostre: a) qual é a maior idade lida b) quantos homens foram cadastrados c)
 * qual é a idade da mulher mais jovem d) qual é a média de idade entre os
 * homens
 */