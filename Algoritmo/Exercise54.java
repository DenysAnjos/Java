package exercises.one.to.a.hundred;

import java.util.Locale;
import java.util.Scanner;

public class Exercise54 {

	public static void main(String[] args) {
		Locale.setDefault(new Locale("en", "US"));
		Scanner sc = new Scanner(System.in);
		int n = 0;
		double weight, height, average = 0;
		int above90 = 0, below50160 = 0, above190100 = 0;
		while (n < 7) {
			System.out.println("Weight(KG)Ex 62.5: ");
			weight = sc.nextDouble();
			System.out.println("Height(M)Ex 1.75: ");
			height = sc.nextDouble();
			average = average + weight;
			if (weight > 90) {
				above90++;
			}
			if (weight < 50 && height < 1.60) {
				below50160++;
			}
			if (height > 1.90 && weight > 100) {
				above190100++;
			}
			n++;
		}
		System.out.println("Average height: " + average / 7);
		System.out.println("Above 90kg: " + above90);
		System.out.println("Below 50kg and 1.60m: " + below50160);
		System.out.println("Above 1.90m and 100kg: " + above190100);
		sc.close();

	}

}
/*
 * 54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas,
 * mostrando no final: a) Qual foi a média de altura do grupo b) Quantas pessoas
 * pesam mais de 90Kg c) Quantas pessoas que pesam menos de 50Kg tem menos de
 * 1.60m d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */