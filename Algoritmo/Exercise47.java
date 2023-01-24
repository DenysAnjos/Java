package exercises.one.to.a.hundred;

public class Exercise47 {

	public static void main(String[] args) {
		int n = 500;
		while (n > 0) {
			System.out.print(n + " + ");
			n = n - 50;
		}
		System.out.println("0");
	}

}
/*
 * 47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500
 * + 450 + 400 + 350 + 300 + ... + 50 + 0
 */