package machine.atm;
public class Transaction {
	
	public void checkBalance(Account account) {
		System.out.println("Total balance: " +account.getTotal_balance());
		System.out.println();
	}
	
	public void withdrawMoney(Account account,int money) {
		if(account.getTotal_balance()> money) {
		int amount = account.getTotal_balance();
		account.setTotal_balance(amount - money);
		System.out.println("Widthdrawl successful!!!");
		System.out.println("New total balance: " +account.getTotal_balance());
		System.out.println();
	} else {
		Screen message = new Screen();
		message.invalidWidthdrawl();
	}
}
	
	public void depositMoney(Account account,int money) {
		int amount = account.getTotal_balance();
		account.setTotal_balance(amount+money);
		System.out.println("Deposit Successful!!!");
		System.out.println("New total balance: " + account.getTotal_balance());
		System.out.println();
	}

}
