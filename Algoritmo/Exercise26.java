package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1: ");
		int number1 = sc.nextInt();
		System.out.println("Number 2: ");
		int number2 = sc.nextInt();
		if(number1>number2) {
			System.out.println("The first number is more than the second.");
		}
		else if(number1==number2){
			System.out.println("There is no greater value. Both are equal.");
		}
		else {
			System.out.println("The second number is more than the first.");
		}
		sc.close();
	}
}
/*
26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando 
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
 */
