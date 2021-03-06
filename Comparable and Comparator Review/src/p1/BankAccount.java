package p1;

public class BankAccount implements Comparable<BankAccount> {
	private int accountNumber;
	private double balance;

	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}

	@Override
	public int compareTo(BankAccount o) {
		BankAccount ba = (BankAccount)(o);
		
		 if (balance > ba.balance) {return 1;} // by changing return from 1 to -1
		 if (balance < ba.balance) {return -1;} // by changing return from -1 to 1
		 return 0;								// you will sort inversely
		 
//		return Double.compare(balance, ba.balance); // alternative compare
	}
	
	
}
