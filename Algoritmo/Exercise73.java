package exercises.one.to.a.hundred;

public class Exercise73 {

	public static void main(String[] args) {
		int vector[] = new int[10];
		for(int n=9; n>=0; n--){
			vector[n] = n;
			System.out.print(vector[n] + " ");
		}
	}
}
/*
73) Crie um programa que preencha automaticamente (usando l�gica, n�o apenas 
atribuindo diretamente) um vetor num�rico com 10 posi��es, conforme abaixo:
9 8 7 6 5 4 3 2 1 0
0 1 2 3 4 5 6 7 8 9
*/