package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise36 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hours of workout in month: ");
		int hours = sc.nextInt();
		if (hours == 10) {
			System.out.printf("Points: " + (hours * 2) + "\nProfit:R$%.2f", (hours * 2) * 0.5);
		} else if (hours > 10 && hours <= 20) {
			System.out.printf("Points: " + (hours * 5) + "\nProfit:R$%.2f", (hours * 5) * 0.5);
		} else {
			System.out.printf("Points: " + (hours * 10) + "\nProfit:R$%.2f", (hours * 10) * 0.5);
		}
		sc.close();
	}

}
/*
 * 36) Um programa de vida saudável quer dar pontos atividades físicas que podem
 * ser trocados por dinheiro. O sistema funciona assim: - Cada hora de atividade
 * física no mês vale pontos - até 10h de atividade no mês: ganha 2 pontos por
 * hora - de 10h até 20h de atividade no mês: ganha 5 pontos por hora - acima de
 * 20h de atividade no mês: ganha 10 pontos por hora - A cada ponto ganho, o
 * cliente fatura R$0,05 (5 centavos) Faça um programa que leia quantas horas de
 * atividade uma pessoa teve por mês, calcule e mostre quantos pontos ela teve e
 * quanto dinheiro ela conseguiu ganhar.
 */