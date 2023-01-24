package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise53 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		String sex;
		int n = 0, numberM = 0, numberW = 0, average = 0, averageM = 0, over20W = 0;

		while (n < 5) {
			System.out.println("Sex: (M) for man (W) for women:");
			sex = sc.next();
			System.out.println("Age: ");
			age = sc.nextInt();
			if (sex.equals("m") || sex.equals("M")) {
				numberM++;
				averageM = averageM + age;
			} else {
				numberW++;
				if (age >= 20) {
					over20W++;
				}
			}
			average = average + age;
			n++;
		}
		System.out.println("Registered men: " + numberM);
		System.out.println("Registered women: " + numberW);
		System.out.println("Average age of the group: " + average / 5);
		System.out.println("Average age of men: " + averageM / numberM);
		System.out.println("Women over 20: " + over20W);

		sc.close();
	}

}
/*
 * 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no
 * final: a) Quantos homens foram cadastrados b) Quantas mulheres foram
 * cadastradas c) A média de idade do grupo d) A média de idade dos homens e)
 * Quantas mulheres tem mais de 20 anos
 */