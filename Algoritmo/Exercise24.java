package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Distance in KM: ");
		double distance = sc.nextDouble();
		if(distance<200) {
			System.out.println("Price:R$" + (distance*0.5));
		}
		else {
			System.out.println("Price:R$" + (distance*0.45));
		}
		sc.close();
	}

}
/*
24) Fa�a um algoritmo que pergunte a dist�ncia que um passageiro deseja 
percorrer em Km. Calcule o pre�o da passagem, cobrando R$0.50 por Km para 
viagens at� 200Km e R$0.45 para viagens mais longas
*/