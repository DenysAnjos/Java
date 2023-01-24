package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a years: ");
		int year = sc.nextInt();
		if(year%400==0 || year%4==0 && year%100>=1) {
			System.out.println("This year IS bissextily.");
		}
		else {
			System.out.println("This year IS NOT bissextily.");
			}
		sc.close();
	}

}
/*
21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
BISSEXTO.
*/
