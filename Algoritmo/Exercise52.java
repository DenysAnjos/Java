package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise52 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int average = 0, over18 = 0, under5 = 0, biggest = 0, n = 0, age;
		while (n < 9) {
			System.out.println("Age: ");
			age = sc.nextInt();
			average = average + age;
			if (age >= 18) {
				over18++;
			}
			if (age <= 5) {
				under5++;
			}
			if (age > biggest) {
				biggest = age;
			}
			n++;
		}
		System.out.println("Average: " + average / 10);
		System.out.println("Over 18: " + over18);
		System.out.println("Under 5: " + under5);
		System.out.println("Biggest age:" + biggest);
		sc.close();

	}

}
/*
 * 52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final: a)
 * Qual é a média de idade do grupo b) Quantas pessoas tem mais de 18 anos c)
 * Quantas pessoas tem menos de 5 anos d) Qual foi a maior idade lida
 */