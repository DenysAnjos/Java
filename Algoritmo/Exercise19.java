package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Grade 1: ");
		double grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		double grade2 = sc.nextDouble();
		double average = ((grade1+grade2)/2);
		System.out.println(name + " has a average: " + average);
		if(average<7.5) {
			System.out.println("You were not approved");
		}
		else {
			System.out.println("You were approved, congratulations!");
		}
		sc.close();
		
	}

}
/*
19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
não um bom aproveitamento (se ficou acima da média 7.0)
*/