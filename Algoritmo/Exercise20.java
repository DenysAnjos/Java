package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int number = sc.nextInt();
		System.out.print("The number:" + number + " is ");
		if(number%2==1) {
			System.out.println("Odd");
		}
		else {
			System.out.println("Pair");
		}
		sc.close();
	}
}
/*
20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou 
ÍMPAR
*/