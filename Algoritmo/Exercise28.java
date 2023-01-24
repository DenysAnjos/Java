package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Width: ");
		double width = sc.nextDouble();
		System.out.println("Lenght: ");
		double lenght = sc.nextDouble();
		double m2 = (lenght * width);
		if (m2 < 100) {
			System.out.printf("m2= %.2f POPULAR TERRAIN.", m2);
		} else if (m2 >= 100 && m2 <= 500) {
			System.out.printf("m2= %.2f MASTER TERRAIN.", m2);
		} else {
			System.out.printf("m2= %.2f VIP TERRAIN.", m2);
		}
		sc.close();
	}

}
/*
 * 28) Fa�a um programa que leia a largura e o comprimento de um terreno
 * retangular, calculando e mostrando a sua �rea em m�. O programa tamb�m
 * devemostrar a classifica��o desse terreno, de acordo com a lista abaixo: -
 * Abaixo de 100m� = TERRENO POPULAR - Entre 100m� e 500m� = TERRENO MASTER -
 * Acima de 500m� = TERRENO VIP
 */