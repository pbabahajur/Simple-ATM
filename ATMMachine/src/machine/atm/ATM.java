package machine.atm;

import java.util.Scanner;

public class ATM {
	
	
	public static void main(String[] args) {
		
		Transaction t = new Transaction();
		BankDatabase db = new BankDatabase();
		Scanner kb = new Scanner(System.in);
		Screen s = new Screen();
		s.displayAccount();
		int accountNumber = kb.nextInt();
		s.displayPin();
		
		
		int pin = kb.nextInt();
		Account account = db.checkAccount(accountNumber, pin);
		if(account !=null) {
			menu(account, t);
		}else {
			System.out.println("Incorrect account and pin combination.");
		}
			
			
	}

	
	public static void menu(Account account, Transaction t) {
		
		
			Screen s = new Screen();
			s.displayMenu();
			
			Scanner kb = new Scanner(System.in);
			
			
			int option = kb.nextInt();
			switch(option) {
			case 1: {
				checkBalance(account,  t);
				menu(account, t);
				break;
			}
			
			
			case 2: {
				
				
				s.withdrawMessage();
				int withdrawlMoney = kb.nextInt();
				withdrawMoney(account, t, withdrawlMoney);
				menu(account, t);
				break;
			}
				
			case 3: {
				s.depositMessage();
				int depositMoney = kb.nextInt();
				depositMoney(account, t, depositMoney);
				menu(account, t);
				break;
				
			}
			case 4: {
				System.out.println("Exited!!");
				break;
			}
		}kb.close();
	}
		
	public static void checkBalance(Account account, Transaction t) {
		t.checkBalance(account);
		
	}
	
	public static void withdrawMoney(Account account, Transaction t,int money) {
		
		t.withdrawMoney(account, money);
	}
	
	public static void depositMoney(Account account, Transaction t, int money) {
		
		t.depositMoney(account, money);
	}

}
