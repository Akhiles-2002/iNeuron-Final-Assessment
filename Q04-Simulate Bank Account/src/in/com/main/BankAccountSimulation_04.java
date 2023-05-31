/*
Question 4 : Create a Java program that simulates a bank account. The program should allow
users to deposit and withdraw money, check their balance.
 */

package in.com.main;

import java.util.Scanner;

public class BankAccountSimulation_04 {

	private double balance;

	public BankAccountSimulation_04() {
		balance = 5000.00;
	}

	public void deposit(double amount) {
		if (amount >= 0) {
			balance += amount;
			System.out.println("Deposit of rupees " + amount + " successful....");
		} else {
			System.out.println("Invalid deposit amount....");
		}
	}

	public void withdraw(double amount) {
		if (amount >= 0) {
			if (balance >= amount) {
				balance -= amount;
				System.out.println("Withdraw of rupees " + amount + " successful....");
			} else {
				System.out.println("Insufficient balance....");
			}
		} else {
			System.out.println("Invalid Withdraw Amount....");
		}
	}

	public double getBalance() {
		return balance;
	}

	public static void main(String[] args) {

		BankAccountSimulation_04 account = new BankAccountSimulation_04();
		Scanner scanner = new Scanner(System.in);

		int choice;
		double amount;

		do {

			System.out.println("Bank Account Simulation Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");

			System.out.println("Enter Your Choice :: ");
			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter the amount to deposit : ");
				amount = scanner.nextDouble();
				account.deposit(amount);
				break;
			case 2:
				System.out.println("Enter the amount to withdraw : ");
				amount = scanner.nextDouble();
				account.withdraw(amount);
				break;
			case 3:
				System.out.println("Your Current Balance Rupees " + account.getBalance());
				break;
			case 4:
				System.out.println("Thank You for Using. Exiting the Program....");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice. Please Enter a Valid Choice.");

			}
			System.out.println();

		} while (choice != 4);

	}

}
