package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Car speed(KM/h): ");
		double vel = sc.nextDouble();
		
		if(vel>80) {
			System.out.printf("Exceeded limit speed!\nTraffic ticket: R$%.2f", ((vel-80)*5));
		}
		else {
			System.out.println("Whitin limit speed.");
		}
		sc.close();
	}

}
/*
17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida
*/