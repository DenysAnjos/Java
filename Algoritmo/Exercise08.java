package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a distance in meters: ");
		double meters = sc.nextDouble();
		System.out.println("The distance of " + meters + "m corresponds to: ");
		System.out.println(meters/1000 + "Km");
		System.out.println(meters/100 + "Hm");
		System.out.println(meters/10 + "Dam");
		System.out.println(meters*10 + "dm");
		System.out.println(meters*100 + "cm");
		System.out.println(meters*1000 + "mm");
		sc.close();
	}
}
/*
8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam
1857.2dm
18572.0cm
185720.0mm
*/