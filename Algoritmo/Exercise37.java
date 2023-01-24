package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		System.out.println("For men type(M) for women type(W): ");
		String genre = sc.next();
		System.out.println("Years working: ");
		double years = sc.nextInt();
		if (genre.equals("M") || genre.equals("m")) {
			if (years < 20) {
				System.out.printf("New salary:R$%.2f", (salary + salary * 3 / 100));
			} else if (years >= 20 && years <= 30) {
				System.out.printf("New salary:R$%.2f", (salary + salary * 13 / 100));
			} else {
				System.out.printf("New salary:R$%.2f", (salary + salary * 25 / 100));
			}
		} else {
			if (years < 15) {
				System.out.printf("New salary:R$%.2f", (salary + salary * 5 / 100));
			} else if (years >= 15 && years <= 20) {
				System.out.printf("New salary:R$%.2f", (salary + salary * 12 / 100));
			} else {
				System.out.printf("New salary:R$%.2f", (salary + salary * 23 / 100));
			}
		}
		sc.close();
	}
}

/*
 * 37) Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um
 * aumento de acordo com alguns fatores. Fa�a um programa que leia o sal�rio
 * atual, o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na
 * empresa. No final, mostre o seu novo sal�rio, baseado na tabela a seguir: -
 * Mulheres - menos de 15 anos de empresa: +5% - de 15 at� 20 anos de empresa:
 * +12% - mais de 20 anos de empresa: +23% - Homens - menos de 20 anos de
 * empresa: +3% - de 20 at� 30 anos de empresa: +13% - mais de 30 anos de
 * empresa: +25%
 * 
 */