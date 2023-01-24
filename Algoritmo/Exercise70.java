package exercises.one.to.a.hundred;

public class Exercise70 {

	public static void main(String[] args) {
		int n1=1,n2=0, n3=0;;
		System.out.print(n1);
		for(int n=1; n<10; n++) {
			n1=n1+n2;
			n3=n1;
			n2=n3-n2;
			System.out.print(" " + n1);
		}
	}
}
/*
70) [DESAFIO] Faça um programa que mostre os 10 primeiros elementos da Sequência 
de Fibonacci:
1 1 2 3 5 8 13 21...

*/