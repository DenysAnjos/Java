package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		int number = sc.nextInt();
		System.out.println("The predecessor of " + number + " is: " + (number-1) + ".");
		System.out.println("The successor of " + number + " is: " + (number+1) + ".");
		sc.close();
	}

}
/* 6) Fa�a um programa que leia um n�mero inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um n�mero: 9
O antecessor de 9 � 8
O sucessor de 9 � 10 */