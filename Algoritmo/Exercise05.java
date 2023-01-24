package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Grade 1: ");
		double grade = sc.nextDouble();
		System.out.println("Grade 2: ");
		double grade2 = sc.nextDouble();
		System.out.println("The average between " + grade + " and " + grade2 + " is " + (grade + grade2)/2 + ".");
		sc.close();
		
		
	}
}
/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
		na tela a sua média na disciplina.
		Ex:
		Nota 1: 4.5/
		Nota 2: 8.5
		A média entre 4.5 e 8.5 é igual a 6.5*/
