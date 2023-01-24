package exercises.one.to.a.hundred;

import java.util.Random;
import java.util.Scanner;

public class Exercise55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random generator = new Random();
		int n = 0;

		System.out.println("Type a number 0 and 10: ");
		int guess = sc.nextInt();
		int number = generator.nextInt(10);
		
		while (n < 3 && guess!=number) {
			System.out.println("Try again:");
			guess = sc.nextInt();
			n++;
		}
		if (number == guess) {
			System.out.println("You win!");
		} else {
			System.out.println("You lose.");
		}
		sc.close();
	}
}
/*
 * 55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
 * agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
 * tentativas para tentar acertar.
 */