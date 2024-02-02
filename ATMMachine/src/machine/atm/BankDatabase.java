package machine.atm;

import java.util.LinkedList;

public class BankDatabase {
	LinkedList<Account> list;
	
	public BankDatabase() {
		list = new LinkedList<Account>();
	}
	public Account checkAccount(int account_number, int pin) {
		Account account = new Account(1234, 1234, 1000);
		Account account1 = new Account(2345, 2345, 1500);
		
		list.add(account);
		list.add(account1);
		
		if(account.getAccount_number() == account_number && account.getPin() == pin) {
			return account;
		} if(account1.getAccount_number() == account_number && account1.getPin() == pin) {
			return account1;
		}
		return null;
	}
		
}
