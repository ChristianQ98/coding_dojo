package OOP.BankAccount;

public class BankAccount {
	// ATTRIBUTES
	private double checkingBalance;
	private double savingsBalance;
	private static int numOfAccounts = 0;
	private static int totalMoney = 0;
	
	
	// CONSTRUCTOR
	public BankAccount(double checkingBalance, double savingsBalance) {
		super();
		this.checkingBalance = checkingBalance;
		this.savingsBalance = savingsBalance;
		numOfAccounts++;
		totalMoney += checkingBalance + savingsBalance;
	}
	
	
	public String depositMoney(String accountType, double amount) {
		if(accountType.equals("Checking") || accountType.equals("checking")) {
			totalMoney += amount;
			return "You have deposited $" + String.format("%.2f", amount) + " into your " + accountType + " account. You now have $" + String.format("%.2f", (this.checkingBalance += amount)) + " in your account.";
		} else if(accountType.equals("Savings") || accountType.equals("savings")) {
			totalMoney += amount;
			return "You have deposited $" + String.format("%.2f", amount) + " into your " + accountType + " account. You now have $" + String.format("%.2f", (this.checkingBalance += amount)) + " in your account.";
		} else {
			return "Invalid Account Type. Please enter either 'Checking' or 'Savings'";
		}
		
	}

	
	public String withdrawMoney(String accountType, double amount) {
		if(accountType.equals("Checking") || accountType.equals("checking")) {
			if(this.checkingBalance - amount < 0) {
				return "Insufficient Funds.";
			} 
			totalMoney -= amount;
			return "You have withdrawn $" + String.format("%.2f", amount) + " from your " + accountType + " account. You now have $" + String.format("%.2f", (this.checkingBalance -= amount)) + " in your account.";
		} else if(accountType.equals("Savings") || accountType.equals("savings")) {
			if(this.savingsBalance - amount < 0) {
				return "Insufficient Funds.";
			} 
			totalMoney -= amount;
			return "You have withdrawn $" + String.format("%.2f", amount) + " from your " + accountType + " account. You now have $" + String.format("%.2f", (this.checkingBalance -= amount)) + " in your account.";
		} else {
			return "Invalid Account Type. Please enter either 'Checking' or 'Savings'.";
		}
	}
	
	
	public static String totalFunds() {
		return "Total funds across all accounts is: $" + totalMoney;
	}
	
	
	public static String totalAccounts() {
		return "You have " + numOfAccounts + " bank accounts open.";
	}
	
	
	public String totalInBankAccount() {
		return "Your total funds across your Checking and Savings account is: $" + String.format("%.2f", (this.checkingBalance + this.savingsBalance));
	}
	
	// GETTERS
	public double getCheckingBalance() {
		return checkingBalance;
	}


	public double getSavingsBalance() {
		return savingsBalance;
	}

}
