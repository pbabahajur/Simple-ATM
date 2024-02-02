package machine.atm;
public class Account{
	
	private int account_number;
	private int pin;
	private int total_balance;
	
	public Account() {
		
	}
	public Account(int account_number, int pin, int total_balance) {
		this.account_number = account_number;
		this.pin = pin;
		this.total_balance = total_balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

//	public int getAvailable_balance() {
//		return available_balance;
//	}
//
//	public void setAvailable_balance(int available_balance) {
//		this.available_balance = available_balance;
//	}

	public int getTotal_balance() {
		return total_balance;
	}

	public void setTotal_balance(int total_balance) {
		this.total_balance = total_balance;
		
	}
	
	
	
	
	
}
