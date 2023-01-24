package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Km traveled: ");
		double km = sc.nextDouble();
		System.out.println("Rented days: ");
		int days = sc.nextInt();
		System.out.println("Total: R$" + ((days*90)+(km*0.2)));
		sc.close();

	}

}

/*
4) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
*/