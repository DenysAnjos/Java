package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise57 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String quest = "y";
		int salaryM = 0, salaryW = 0;
		while (quest.equals("y") || quest.equals("yes")) {
			System.out.println("Type (M) for man and (W) for woman:");
			String sex = sc.next();
			System.out.println("Type your salary: ");
			double salary = sc.nextDouble();
			if (sex.equals("M") || sex.equals("m")) {
				salaryM += salary;
			} else {
				salaryW += salary;
			}
			System.out.println("Do you want continue?(y/n) ");
			quest = sc.next();
		}
		System.out.println("Total salary men: R$" + salaryM);
		System.out.println("Total salary women: R$" + salaryW);
		sc.close();
	}
}
/*
 * 57) Desenvolva um aplicativo que leia o sal�rio e o sexo de v�rios
 * funcion�rios. No final, mostre o total de sal�rios pagos aos homens e o total
 * pago �s mulheres. O programa vai perguntar ao usu�rio se ele quer continuar
 * ou n�o sempre que ler os dados de um funcion�rio
 */