package main;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		int balance = 50000, withdraw, deposit, num;
		Scanner scn = new Scanner(System.in);

		display : while (true) {
			System.out.println("Welcome to ATM Machine");
			System.out.println("\n Please Choose on of the Following Function: ");
			System.out.println("1. Withdraw Money");
			System.out.println("2. Deposit Money");
			System.out.println("3. Check Balance");
			System.out.println("4. Quit");

			num = scn.nextInt();

			switch (num) {
			case 1:
				System.out.println("Please enter the amount to be withdrawn: ");
				withdraw = scn.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please Collect the Money");
					System.out.println("Your updated Balance is: " + balance);
				} else {
					System.out.println("\nNot Enough Balance to Withdraw!!\n");
				}
				System.out.println("");
				break;
			case 2:
				System.out.println("Please enter the amount to be Deposited: ");
				deposit = scn.nextInt();
				balance = balance + deposit;
				System.out.println("Money Deposited Sucessfully");
				System.out.println("Your updated Balance is: " + balance);
				System.out.println("");
				break;
			case 3:
				System.out.println("\n Your Current Balance is: "+ balance);
				System.out.println();
				break;
			case 4:
				System.out.println("\nThanks for Visiting ATM \n");
				break display;
			default:
				break;
			}
		}

	}

}
