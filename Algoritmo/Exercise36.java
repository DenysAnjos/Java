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
 * 36) Um programa de vida saud�vel quer dar pontos atividades f�sicas que podem
 * ser trocados por dinheiro. O sistema funciona assim: - Cada hora de atividade
 * f�sica no m�s vale pontos - at� 10h de atividade no m�s: ganha 2 pontos por
 * hora - de 10h at� 20h de atividade no m�s: ganha 5 pontos por hora - acima de
 * 20h de atividade no m�s: ganha 10 pontos por hora - A cada ponto ganho, o
 * cliente fatura R$0,05 (5 centavos) Fa�a um programa que leia quantas horas de
 * atividade uma pessoa teve por m�s, calcule e mostre quantos pontos ela teve e
 * quanto dinheiro ela conseguiu ganhar.
 */