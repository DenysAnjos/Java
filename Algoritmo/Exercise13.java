package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise13 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your salary: ");
		double salary = sc.nextDouble();
		System.out.printf("Your new salary is: R$%.2f", (salary+salary*15/100));
		sc.close();
	}
}
/*
13) Fa�a um algoritmo que leia o sal�rio de um funcion�rio, calcule e mostre o
seu novo sal�rio, com 15% de aumento.
*/