package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Year Born: ");
		int yearBorn = sc.nextInt();
		System.out.println("Year Current: ");
		int yearCurrent = sc.nextInt();
		int age = yearCurrent - yearBorn;
		if(age==18) {
			System.out.println("You have: " + age + " years old, and ready for military enlistment.");
		}
		else if(age>18) {
			System.out.println("You have: " + age + " years old, and " + (age-18) + " years have passed from military enlistment.");
		}
		else {
			System.out.println("You have: " + age + " years old, and " + (18-age) + " year(s) to go until military enlistment.");
		}
		sc.close();
	}
}
/*
22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
alistamento
*/