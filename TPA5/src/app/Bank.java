//Harrisen Sanchez
//2/10/17
package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Bank {

	private Account account[];
	private BufferedReader read;
	private int accountCount;

	public Bank() {

	}
//a constructor will initialize the instance of the state of the class
	public void addAccount() throws IOException {

		Scanner scan = new Scanner(System.in);
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

	 this.account = new Account[15];
		int accountCount = 0;
		boolean finished = false;
		
		do {
			System.out.print("Would you like to add an account? (Y/N) ");
			String input;
			input = scan.nextLine();
			finished = input.toUpperCase().charAt(0) == 'Y' ? false : true;
			if (!finished) {

				double bal = 1;
				String num = "";
				int nums = 1;
				String acc;
				System.out.print("What is the name of the account? ");
				input = read.readLine();

				System.out.println("What is the account type?");
				System.out.println("1 - Checking");
				System.out.println("2 - Savings");
				acc = read.readLine();
				nums = Integer.parseInt(acc);

				System.out.println("What is the account balance? :");
				num = read.readLine();
				bal = Double.parseDouble(num);

				if (nums == 1) {

					this.account[this.accountCount++] = new Account(input, Account.TYPE.Checking, bal);

				} else if (nums == 2) {
					this.account[this.accountCount++] = new Account(input, Account.TYPE.Savings, bal);
				}

			}
		} while (!finished);

	}

	public void displayAccount() {
		System.out.println("Bank Accounts");
		for (Account a : this.account) {
			if (a != null)
				System.out.println(a);

		}

	}
	
	
	
	
	
	
}
