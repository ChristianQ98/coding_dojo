class BankAccount:
    # Create a BankAccount class with the attributes interest rate and balance
    def __init__(self, int_rate, name):
        self.int_rate = int_rate
        self.name = name
        self.balance = 0
    # Add a deposit method to the BankAccount class
    def deposit(self, amount):
        self.balance += amount
        return self
    # Add a withdraw method to the BankAccount class
    def withdraw(self, amount):
        self.balance -= amount
        return self
    # Add a display_account_info method to the BankAccount class
    def display_account_info(self):
        print("Name:",self.name,", Balance:",self.balance)
    # Add a yield_interest method to the BankAccount class
    def yield_interest(self):
        self.balance += self.balance * self.int_rate
        return self
    @staticmethod
    def has_funds(balance, amount):
        return balance - amount >= 0

# Create 2 accounts
account1 = BankAccount(0.05, "User 1")
account2 = BankAccount(0.05, "User 2")

# To the first account, make 3 deposits and 1 withdrawal, then yield interest and display the account's info all in one line of code (i.e. chaining)
account1.deposit(500).deposit(100).deposit(750).withdraw(300).yield_interest().display_account_info()

# To the second account, make 2 deposits and 4 withdrawals, then yield interest and display the account's info all in one line of code (i.e. chaining)
account2.deposit(1000).deposit(400).withdraw(100).withdraw(200).withdraw(200).withdraw(500).yield_interest().display_account_info()
