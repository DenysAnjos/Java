package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise15 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Worked days: ");
		int days = sc.nextInt();
		int salary = days*(8*25);
		System.out.println("Salary:" + salary);
		sc.close();
	}
}
/*
15) Crie um programa que leia o n�mero de dias trabalhados em um m�s e mostre o 
sal�rio de um funcion�rio, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada.
*/