package machine.atm;

public class Screen {
	public void incorrectPin() {
		System.out.println("Incorrect pin!!!");
	}
	
	public void invalidWidthdrawl() {
		System.out.println("Insufficient balance!!!");
	}
	public void displayAccount() {
		System.out.println("Enter account number: ");
	}
	public void displayPin() {
		System.out.println("Enter pin:");
	}
	
	public void displayMenu() {
		System.out.println("1. Balance Inquiry");
		System.out.println("2. Withdrawl");
		System.out.println("3. Deposit");
		System.out.println("4. Exit");
	}
	
	public void withdrawMessage() {
		System.out.println("Enter amount for withdrawl: ");
	}
	
	public void depositMessage() {
		System.out.println("Enter amount for deposit: ");
	}
}
