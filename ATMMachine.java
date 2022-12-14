package atmmachine;

import java.util.Scanner;

public class ATMMachine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] account = new int[10];
        double[] balance = new double[10];

        String message = "Main Manu:\n "
                + "1: Check Balance\n "
                + "2: Withdraw\n "
                + "3: Deposit\n "
                + "4: Exit\n "
                + "Enter a chice :  ";

        for (int i = 0; i < balance.length; i++) {
            account[i] = i;
            balance[i] = 100;
        }

        System.out.print("Enter any account number: ");
        int acNumber = input.nextInt();
        acNumber = testAccount(acNumber, account);

        boolean status = true;

        if (acNumber == -1) {
            System.out.println("Incorrect account number!!");
        } else {
            while (status) {
                System.out.print(message);
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Balance is: $" + balance[acNumber]);
                        break;
                    case 2:
                        System.out.print("Enter withdraw amount: ");
                        double withdraw = input.nextDouble();
                        if (withdraw > balance[acNumber]) {
                            System.out.println("Your withdraw amount is over than balance!!");
                        } else {
                            double correntBalance = balance[acNumber] - withdraw;
                            balance[acNumber] = correntBalance;
                        }
                        break;
                    case 3:
                        System.out.print("Enter your deposit amount: ");
                        double deposit = input.nextDouble();
                        double newbalance = balance[acNumber] + deposit;
                        balance[acNumber] = newbalance;
                        break;
                    case 4:
                        status = false;
                        System.out.println("Thanks for using!!");
                        break;
                    default:
                        System.out.println("Incorrect USSD");
                }
            }
        }

    }

    public static int testAccount(int id, int[] account) {
        for (int acc : account) {
            if (acc == id) {
                return id;
            }
        }

        return -1;

    }

}
