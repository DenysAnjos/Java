package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise68 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberW = 0, menOver100 = 0;
		double weight, sumWW = 0, biggestWeight = 0;
		String sex;
		for (int n = 0; n < 8; n++) {
			System.out.println("Type (m) for man and (w) for woman: ");
			sex = sc.next();
			System.out.print("Type your weight: ");
			weight = sc.nextDouble();
			System.out.println();
			if (sex.equals("w") || sex.equals("W")) {
				numberW++;
				sumWW += weight;
			}
			if (sex.equals("m") || sex.equals("M")) {
				if (weight > 100) {
					menOver100++;
				}
				if (weight > biggestWeight) {
					biggestWeight = weight;
				}
			}
		}
		System.out.println("Number women: " + numberW);
		System.out.println("Men over 100kg: " + menOver100);
		System.out.printf("Media weight women: %.2f", (sumWW / numberW));
		System.out.println("\nBiggest weight amoung men: " + biggestWeight);
		sc.close();
	}
}
/*
 * 68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
 * “para”. No final, mostre na tela: a) Quantas mulheres foram cadastradas b)
 * Quantos homens pesam mais de 100Kg c) A média de peso entre as mulheres d) O
 * maior peso entre os homens
 */
