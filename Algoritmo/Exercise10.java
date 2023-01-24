package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Width: ");
		double width = sc.nextDouble();
		System.out.println("Height: ");
		double height = sc.nextDouble();
		double area = (height*width);
		System.out.printf("The area is: %.1f and %.1f liters of paint will be needed.", area, (area/2));
		sc.close();

	}

}

/*
10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.
*/