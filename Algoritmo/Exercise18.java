package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ano de nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.println("Ano atual: ");
		int anoAtual = sc.nextInt();
		int idade = (anoAtual-anoNasc);
		System.out.println("A sua idade é de: " + (idade));
		if(idade<18) {
			System.out.println("Você não possui a maioridade, ou seja não pode votar.");
		}
		else{
			System.out.println("Você possui a maioridade, está apto a votar.");
		}
		sc.close();
	}

}
/*
18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
dela e depois mostre se ela pode ou não votar
*/