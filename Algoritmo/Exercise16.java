package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cigaretts for days: ");
		int cigaretts = sc.nextInt();
		System.out.println("How many years: ");
		int years = sc.nextInt();
		int days = (cigaretts*10*365*years)/1440;
		System.out.println("Wasted days: " + days);
		sc.close();
	}

}
/*
16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um 
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele 
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule 
quantos dias de vida um fumante perderá e exiba o total em dias.
*/