package Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account c = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a account number:" );
        c.setNumber(sc.nextInt());
        System.out.println("Enter a account holder:" );
        sc.nextLine();
        c.setName(sc.nextLine());
        System.out.println("Is there a initial deposit value (y/n)?" );
        c.setInitial(sc.next());
        if(c.getInitial().equals("y")) {
            System.out.println("Enter a initial deposit value:");
            c.deposit(sc.nextFloat());
        }
        System.out.println("Account data: " + c.toString());

        System.out.println("Enter a deposit value: ");
        c.deposit(sc.nextFloat());
        System.out.println("Update account data: " + c.toString());

        System.out.println("Enter a withdraw value: ");
        c.withdraw(sc.nextFloat());
        System.out.println("Update account data: " + c.toString());
        sc.close();
    }
}
