package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Years working: ");
		int yearsW = sc.nextInt();
		if (yearsW < 3) {
			System.out.printf(name + " your new salary is:R$%.2f", salary + (salary * 3 / 100));
		} else if (yearsW >= 3 && yearsW < 10) {
			System.out.printf(name + " your new salary is:R$%.2f", salary + (salary * 12.5 / 100));
		} else if (yearsW >= 10) {
			System.out.printf(name + " your new salary is:R$%.2f", salary + (salary * 20 / 100));
		}
		sc.close();
	}
}
/*
 * 29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
 * quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
 * acordo com a tabela a seguir: - Até 3 anos de empresa: aumento de 3% - entre
 * 3 e 10 anos: aumento de 12.5% - 10 anos ou mais: aumento de 20%
 */