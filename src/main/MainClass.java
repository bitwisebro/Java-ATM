package main;

import java.util.*;

public class MainClass extends ATM_methods {
	
//	private static final Scanner scn = null;

	public static void main(String[] args) {
		int balance = 50000, withdraw, deposit, num;
		Scanner scn = new Scanner(System.in);

		display: while (true) {
			greet();
			num = scn.nextInt();

			switch (num) {
			case 1:
				System.out.println("Please enter the amount to be withdrawn: ");
				withdraw = scn.nextInt();
				withdraw(balance,withdraw);
				break;
			case 2:
				System.out.println("Please enter the amount to be Deposited: ");
				deposit = scn.nextInt();
				deposit(balance,deposit);
				break;
			case 3:
				System.out.println("\n Your Current Balance is: " + balance);
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
