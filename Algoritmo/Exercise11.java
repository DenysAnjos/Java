package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type A value: ");
		int a = sc.nextInt();
		System.out.println("Type B value: ");
		int b = sc.nextInt();
		System.out.println("Type C value: ");
		int c = sc.nextInt();
		int delta = (b*b)-4*a*c;
		System.out.println("Delta is iqual to: " + delta);
		sc.close();
		
		
	}

}
/*
11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta

*/