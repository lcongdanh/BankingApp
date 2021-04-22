import java.util.Scanner;

public class BankAccount {
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cName, String cId) {
		this.customerName = cName;
		this.customerId = cId;
	}
	
	void deposit(int amount) {
		if(amount != 0) {
			balance = balance + amount;
			previousTransaction = amount;
		}
		System.out.println("You have deposited " + amount);
	}
	
	void withdraw(int amount) {
		if(amount != 0) {
			balance = balance - amount;
			previousTransaction = -amount;
		}
		System.out.println("You have withdrawed " + amount);
	}
	
	void getPreviousTransaction() {
		System.out.println("Previous transaction:");
		if(previousTransaction > 0) {
			System.out.println("Deposited: " + previousTransaction);
		}
		else if (previousTransaction < 0) {
			System.out.println("Withdrawn: " + Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occur");
		}
	}
	
	void operateOption(char option, Scanner scanner) {
		 switch(option) {
			 case 'A':
				 showBalance();
				 break;
			 case 'B':
				 deposit(getAmount(scanner));
				 break;
			 case 'C':
				 withdraw(getAmount(scanner));
				 break;
			 case 'D':
				 getPreviousTransaction();
				 break;
			 case 'E':
				 exitApp();
				 break;
			 default:
				 System.out.println("Invalid option!. Please enter again");
		 }
	}
	
	void showBalance() {
		 System.out.println("Balance = " + balance);
	}
	
	int getAmount(Scanner scanner) {
		 System.out.println("Enter an amount: ");
		 int amount = scanner.nextInt();
		 return amount;
	}
	void exitApp() {
		 System.out.println("Exit the BankApp");
	}
}