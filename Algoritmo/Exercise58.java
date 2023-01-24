package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise58 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		;
		int quest=0, students=0, total=0;
		while(quest!=999) {
			System.out.print("Age? ");
			quest = sc.nextInt();
			total += quest;
			students++;
			
		}
		System.out.println("Total students:" + students);
		System.out.println("Media age:" + (total-999)/(students-1));
		sc.close();

	}
}
/*
58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa 
vai parar quando for digitada a idade 999. No final, mostre quantos alunos 
existem na turma e qual é a média de idade do grupo.
*/