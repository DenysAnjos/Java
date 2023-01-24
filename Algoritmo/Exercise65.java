package exercises.one.to.a.hundred;

public class Exercise65 {

	public static void main(String[] args) {
		for (int n = 100; n > -1; n -= 10) {
			System.out.print(n + " ");
		}
		System.out.print("end!");
	}
}
/*
 * 65) Desenvolva um programa usando a estrutura “para” que mostre na tela a
 * seguinte contagem: 100 90 80 70 60 50 40 30 20 10 0 Acabou!
 */