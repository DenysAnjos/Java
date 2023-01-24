package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Grade 1: ");
		double grade1 = sc.nextDouble();
		System.out.println("Grade 2: ");
		double grade2 = sc.nextDouble();
		double media = (grade1 + grade2)/2;
		if(media<5) {
			System.out.println("DISAPPROVED!!!");
		}
		else if(media>=5 && media<7) {
			System.out.println("RECOVERY!!!");
		}
		else {
			System.out.println("APPROVED!!!");
		}
		sc.close();
	}

}
/*
 * 27) Crie um programa que leia duas notas de um aluno e calcule a sua m�dia,
 * mostrando uma mensagem no final, de acordo com a m�dia atingida: - M�dia at�
 * 4.9: REPROVADO - M�dia entre 5.0 e 6.9: RECUPERA��O - M�dia 7.0 ou superior:
 * APROVADO
 */