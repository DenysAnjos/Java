package exercises.one.to.a.hundred;

import java.util.Scanner;

public class Exercise56 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int total=0, sum=0;
	while(sum!=1111) {
		System.out.println("Type a number:");
		sum = sc.nextInt();
		total += sum;
	}
	if(sum==1111 && total>0) {
		System.out.println("Sum:" + (total - 1111));
		sc.close();
	}
	else {
	System.out.println("The program get out.");
	sc.close();

	}

}}
/*
56) Crie um programa que leia v�rios n�meros pelo teclado e mostre no final o 
somat�rio entre eles.
Obs: O programa ser� interrompido quando o n�mero 1111 for digitado
*/