package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise35 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many days? ");
		int days = sc.nextInt();
		System.out.println("Travelled distance(KM): ");
		double km = sc.nextDouble();
		System.out.println("For popular car type(P) for luxury car type(L): ");
		String car = sc.next();
		if (car.equals("P") || car.equals("p")) {
			if (km <= 100) {
				System.out.printf("Value to pay: R$%.2f", (90 * days) + (0.2 * km));
			} else {
				System.out.printf("Value to pay: R$%.2f", (90 * days) + (0.1 * km));
			}
		} else {
			if (km <= 200) {
				System.out.printf("Value to pay: R$%.2f", (150 * days) + (0.3 * km));
			} else {
				System.out.printf("Value to pay: R$%.2f", (150 * days) + (0.25 * km));
			}
		}
		sc.close();
	}
}
/*
 * 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia
 * para carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um
 * programa que leia o tipo de carro alugado (popular ou luxo), quantos dias de
 * aluguel e quantos Km foram percorridos. No final mostre o preço a ser pago de
 * acordo com a tabela a seguir: - Carros populares (aluguel de R$90 por dia) -
 * Até 100Km percorridos: R$0,20 por Km - Acima de 100Km percorridos: R$0,10 por
 * Km - Carros de luxo (aluguel de R$150 por dia) - Até 200Km percorridos:
 * R$0,30 por Km - Acima de 200Km percorridos: R$0,25 por Km
 */