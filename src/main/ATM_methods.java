package main;

import java.util.Scanner;

public class ATM_methods {

	private static int pin = 1234;

	public static void greet() {
		System.out.println("Welcome to ATM Machine");
		System.out.println("\n Please Choose on of the Following Function: ");
		System.out.println("1. Withdraw Money");
		System.out.println("2. Deposit Money");
		System.out.println("3. Check Balance");
		System.out.println("4. Quit");
	}

	public static void withdraw(int balance, int withdraw, Scanner scn) {

		System.out.println("Enter Your PIN: ");
		int enteredPIN = scn.nextInt();
		if (enteredPIN == pin) {

			if (balance >= withdraw) {
				balance = balance - withdraw;
				System.out.println("Please Collect the Money");
				System.out.println("Your updated Balance is: " + balance);
			} else {
				System.out.println("\nNot Enough Balance to Withdraw!!\n");
			}
			System.out.println("");
		} else {
			System.out.println("Entered PIN is Incorrect! Please try Again!! \n");
		}
	}

	public static void deposit(int balance, int deposit, Scanner scn) {
		System.out.println("Enter Your PIN: ");
		int enteredPIN = scn.nextInt();
		if (enteredPIN == pin) {
			balance = balance + deposit;
			System.out.println("Money Deposited Sucessfully");
			System.out.println("Your updated Balance is: " + balance);
			System.out.println("");
		} else {
			System.out.println("Entered PIN is Incorrect! Please try Again!! \n");
		}
	}
}
