package application;
import java.util.Locale;
import java.util.Scanner;

import model.Account;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("- - - - - - - - - - -");
        System.out.println("Welcome to bank BBC!");
        System.out.println("- - - - - - - - - - -");

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holderNameAccount = sc.nextLine();
        
        System.out.print("Is there na initial deposit (y/n)? ");
        char hasInitialDeposit = sc.next().toLowerCase().charAt(0);

        if (hasInitialDeposit != 'n') {
            System.out.print("Enter initial deposit value: ");
            double initialValue = sc.nextDouble();
            account = new Account(accountNumber, holderNameAccount, initialValue);
        } else {
            account = new Account(accountNumber, holderNameAccount);
        }

        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(account);

        sc.close();
    }
}
