package exercises.one.to.a.hundred;

public class Exercise41 {

	public static void main(String[] args) {
		int n = 100;
		System.out.print("Counting:");
		while (n > -1) {
			System.out.print(n + " ");
			n = n - 5;
		}
		System.out.print("End!");
	}

}
/*
 * 41) Desenvolva um programa que mostre na tela a seguinte contagem: 100 95 90
 * 85 80 ... 0 Acabou!
 */