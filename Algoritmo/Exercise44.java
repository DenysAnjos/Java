package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise44 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Initial value: ");
		int initial = sc.nextInt();
		System.out.println("Final value: ");
		int fina = sc.nextInt();
		System.out.println("Increment: ");
		int increment = sc.nextInt();
		System.out.print("Counting:");
		while (initial < fina) {
			System.out.print(initial + " ");
			initial = initial + increment;
		}
		System.out.println("End!");
		sc.close();

	}

}
/*
 * 44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
 * incremento, mostrando em seguida todos os valores no intervalo: Ex: Digite o
 * primeiro Valor: 3 Digite o último Valor: 10 Digite o incremento: 2 Contagem:
 * 3 5 7 9 Acabou!
 */