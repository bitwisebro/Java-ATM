package main;

import java.util.*;

public class MainClass extends ATM_methods {
//	private static int pin = 1234;

	public static void main(String[] args) throws Exception {
		int balance = 50000, withdraw, deposit, num;
		int sleep = 1500;
		Scanner scn = new Scanner(System.in);

		try {
			mainLoop: while (true) {
				greet();
				num = scn.nextInt();

				switch (num) {
				case 1:
					System.out.println("Please enter the amount to be withdrawn: ");
					withdraw = scn.nextInt();
					withdraw(balance, withdraw, scn);
					Thread.sleep(sleep);
					break;
				case 2:
					System.out.println("Please enter the amount to be Deposited: ");
					deposit = scn.nextInt();
					deposit(balance, deposit, scn);
					Thread.sleep(sleep);
					break;
				case 3:
					showBalance(balance, scn);
					Thread.sleep(sleep);
					break;
				case 4:
					System.out.println("\nThanks for Visiting ATM \n");
					break mainLoop;
				default:
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid Request");
			System.out.println();
		}

	}

}
