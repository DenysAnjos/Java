package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Home value: ");
		double homeV = sc.nextDouble();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Years to pay: ");
		int yearsP = sc.nextInt();
		double installments = (homeV / 12 / yearsP);
		if (installments < salary - (salary * (70 / 100))) {
			System.out.println("Loan rejected!");
		} else {
			System.out.println("Load accepted!");
		}
		sc.close();
	}
}
/*
 * 33) Escreva um programa para aprovar ou não o empréstimo bancário para a
 * compra de uma casa. O programa vai perguntar o valor da casa, o salário do
 * comprador e em quantos anos ele vai pagar. Calcule o valor da prestação
 * mensal, sabendo que ela não pode exceder 30% do salário ou então o empréstimo
 * será negado.
 */