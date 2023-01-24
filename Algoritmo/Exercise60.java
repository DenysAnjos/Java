package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise60 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, olderAge = 0, youngerWomanAge = 99, mediaGroup = 0, numberGroup = 0, menOver30 = 0, womenUnder18 = 0;
		String quest = "y", sex, name, olderName = ".", youngerWomanName = ".";
		while (quest.equals("y") || quest.equals("Y")) {
			System.out.println("Type (m) for man and (w) for woman: ");
			sex = sc.next();
			System.out.println("Name: ");
			name = sc.next();
			System.out.println("Age: ");
			age = sc.nextInt();
			System.out.println("Do you want continue?(y/n)");
			quest = sc.next();
			mediaGroup += age;
			numberGroup++;

			if (age > olderAge) {
				olderName = name;
				olderAge = age;
			}
			if (sex.equals("w") || sex.equals("W") && age < youngerWomanAge) {
				youngerWomanAge = age;
				youngerWomanName = name;
			}
			if (sex.equals("m") || sex.equals("M") && age > 30) {
				menOver30++;
			}
			if (sex.equals("w") || sex.equals("W") && age < 18) {
				womenUnder18++;
			}
		}
		System.out.println("Older: " + olderName);
		System.out.println("Younger woman name: " + youngerWomanName);
		System.out.println("Media age: " + (mediaGroup / numberGroup));
		System.out.println("Men over 30: " + menOver30);
		System.out.println("Women under 18: " + womenUnder18);
		sc.close();
	}
}
/*
 * 60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias
 * pessoas. O programa vai perguntar se o usuário quer ou não continuar. No
 * final, mostre: a) O nome da pessoa mais velha b) O nome da mulher mais jovem
 * c) A média de idade do grupo d) Quantos homens tem mais de 30 anos e) Quantas
 * mulheres tem menos de 18 anos
 */