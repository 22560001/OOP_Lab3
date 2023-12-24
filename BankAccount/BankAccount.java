package BankAccount;

class BankAccount {
    protected double balance;

    public BankAccount() {
        balance = 100;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful");
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw of $" + amount + " successful");
        } else {
            System.out.println("Invalid withdraw amount or Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
    	  if (getBalance() - amount >= 100) {
              super.withdraw(amount);
          } else {
            System.out.println("Invalid withdrawal. Minimum balance is $100");
        }
    }
}
