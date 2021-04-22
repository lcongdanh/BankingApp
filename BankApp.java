import java.util.Scanner;

public class BankApp {
	BankAccount account;
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Danh Le", "BA90771");
		BankApp bankApp = new BankApp(account);
		bankApp.run();
	}
	
	public BankApp(BankAccount acount) {
		this.account = acount;
	}
	
	void run() {
		showMenu();
		calculateAccountValues(account);
	}
	
	void showMenu() {
		 System.out.println("Welcome " + account.customerName);
		 System.out.println("Your ID is " + account.customerId);
		 System.out.println("\n");
		 System.out.println("A. Check Balance");
		 System.out.println("B. Deposit");
		 System.out.println("C. Withdraw");
		 System.out.println("D. Previous Transaction");
		 System.out.println("E. Exit");
		 System.out.println("Enter an option to use the App");
	}
	
	void calculateAccountValues(BankAccount acount) {
		 char option = '\0';
		 Scanner scanner = new Scanner(System.in);
		 do {
			 option = scanner.next().charAt(0);
			 account.operateOption(option, scanner);
		} while (option != 'E');
		scanner.close();
		System.out.println("Thank your for using our service");
	}

}



