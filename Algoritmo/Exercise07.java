package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a number: ");
		double number = sc.nextDouble();
		System.out.println("The double of " + number + " is " + (number*2) + ".");
		System.out.println("The third part of " + number + " is " + (number/3) + ".");
		sc.close();

	}

}
/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/