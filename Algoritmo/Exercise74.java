package exercises.one.to.a.hundred;

public class Exercise74 {

	public static void main(String[] args) {
		int vector[] = new int[10];	
		for(int n=0; n<10; n++) {
			if(n%2==0) {
			System.out.print(vector[n] += 5 );
			}
			else {
				System.out.print(vector[n] += 3);
			}
			System.out.print(" ");
				}
	}
}
/*
74) Crie um programa que preencha automaticamente (usando lógica, não apenas 
atribuindo diretamente) um vetor numérico com 10 posições, conforme abaixo:
5 3 5 3 5 3 5 3 5 3
0 1 2 3 4 5 6 7 8 9
*/