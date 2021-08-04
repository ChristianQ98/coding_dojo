package OOP.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		// Bank 1 has $1000 in its checking account & $5000 in its saving account
		BankAccount b1 = new BankAccount(1000, 5000);
		// Bank 1 is depositing $1000 into their checking account
		System.out.println(b1.depositMoney("Checking", 1000));
		// Bank 1 is depositing $500 into their savings account
		System.out.println(b1.depositMoney("Savings", 500));
		
		// Bank 1 is withdrawing $1500 from their savings account
		System.out.println(b1.withdrawMoney("Savings", 1500));
		// Bank 1 is attempting to withdraw $2500 from their checking account, but does not have sufficient funds
		System.out.println(b1.withdrawMoney("Checking", 2500));
		
		// Create a new Bank Account
		BankAccount b2 = new BankAccount(500, 1000);
		System.out.println(b1.getCheckingBalance());
		System.out.println(b1.getSavingsBalance());
		System.out.println(b2.getCheckingBalance());
		System.out.println(b2.getSavingsBalance());
		System.out.println(b1.totalInBankAccount());
		System.out.println(BankAccount.totalFunds());
		System.out.println(BankAccount.totalAccounts());
	}


}
