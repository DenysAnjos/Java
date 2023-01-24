package exercises.one.to.a.hundred;

public class Exercise75 {

	public static void main(String[] args) {
		int vetor[] = new int[15];
		vetor[1]=1;
		for(int n=2; n<15; n++) {
			vetor[n] = vetor[n-1] + vetor[n-2];
			
			System.out.print(vetor[n] + " ");
		}
	}
}
/*
75) Crie um programa que preencha automaticamente (usando l�gica, n�o apenas 
atribuindo diretamente) um vetor num�rico com 15 posi��es com os primeiros 
elementos da sequ�ncia de Fibonacci:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987
0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
*/