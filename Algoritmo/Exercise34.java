package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Weight: ");
		double weight = sc.nextDouble();
		System.out.println("Height: ");
		double height = sc.nextDouble();
		double imc = weight / (height * height);
		if (imc < 18.5) {
			System.out.println("IMC: " + imc + "\nUnder weight.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.printf("IMC: %.2f\nIdeal weight.", imc);
		} else if (imc >= 25 && imc < 30) {
			System.out.printf("IMC: %.2f\nOverweight.", imc);
		} else if (imc >= 30 && imc < 40) {
			System.out.printf("IMC: %.2f\nObesity.", imc);
		} else {
			System.out.printf("IMC: %.2f\nMorbit obesity.", imc);
		}
		sc.close();
	}
}
/*
 * 34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e
 * no peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
 * indivíduo dentro de certas faixas. - abaixo de 18.5: Abaixo do peso - entre
 * 18.5 e 25: Peso ideal - entre 25 e 30: Sobrepeso - entre 30 e 40: Obesidade -
 * acima de 40: Obseidade mórbida
 */