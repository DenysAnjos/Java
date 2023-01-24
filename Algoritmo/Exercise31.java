package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose between rock, paper and scissor");
		System.out.println("Player 1: ");
		String p1 = sc.nextLine();
		System.out.flush();
		System.out.println("Player 2: ");
		String p2 = sc.nextLine();
		if (p1.equals("rock") && p2.equals("rock") || p1.equals("paper") && p2.equals("paper")
				|| p1.equals("scissor") && p2.equals("scissor")) {
			System.out.println("Incompatible results.");
		} else if (p1.equals("paper") && p2.equals("rock")) {
			System.out.println("Player 1 winner!");
		} else if (p1.equals("rock") && p2.equals("scissor")) {
			System.out.println("Player 1 winner!");
		} else if (p1.equals("scissor") && p2.equals("paper")) {
			System.out.println("Player 1 winner!");
		} else {
			System.out.println("Player 2 winner!");
		}
		sc.close();
	}

}
/*
 * 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */