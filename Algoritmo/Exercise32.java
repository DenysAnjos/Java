package exercises.one.to.a.hundred;

import java.util.Random;
import java.util.Scanner;

public class Exercise32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("Type a number 0 and 5: ");
		int guess = sc.nextInt();
		if (guess == generator.nextInt(5)) {
			System.out.println("You right!");
		} else {
			System.out.println("You wrong!");
		}
		sc.close();
	}
}
/*
 * 32) [DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e
 * 5 o jogador vai tentar descobrir qual foi o valor sorteado.
 */