package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many reais do you have? ");
		double reais = sc.nextDouble();
		System.out.printf("R$" + reais + " reais is iqual to U$%.2f dollars", (reais/3.45));
		sc.close();

	}

}
/*
9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.*/