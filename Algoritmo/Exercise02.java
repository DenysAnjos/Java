package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("Hello, " + name + " nice to meet you!");
		sc.close();

	}

}
/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/