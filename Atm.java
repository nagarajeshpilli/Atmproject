public class Atm {
	private double balance;      //declare a variable
	private double depositAmount;
	private double withdrawAmount;
	// they are in private condition then we initialize setters and getters and parameterized constructor and default constructor
	// firstly we create a default constructor
	
	public Atm() {
		super();
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	// in this case we doesn't use the parameterized constructor
	// they can use with setters and getters
	@Override
	public String toString() {
		return "Atm [balance=" + balance + ", depositAmount=" + depositAmount + ", withdrawAmount=" + withdrawAmount
				+ "]";
	}
	
	
	

}