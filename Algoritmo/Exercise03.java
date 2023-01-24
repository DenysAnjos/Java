package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Employee name: ");
		String name = sc.nextLine();
		System.out.println("Salary: ");
		double salary = sc.nextDouble();
		System.out.println("The employee " + name + " has a salary of R$" + salary + " in June.");
		sc.close();
	}
	}

/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/