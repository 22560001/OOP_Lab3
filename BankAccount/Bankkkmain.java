package BankAccount;


public class Bankkkmain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.deposit(1400);
        System.out.println("Current balance: $" + savingsAccount.getBalance());
        
        savingsAccount.withdraw(500); 
        System.out.println("Current balance: $" + savingsAccount.getBalance());

        savingsAccount.withdraw(900.01); 
        System.out.println("Current balance: $" + savingsAccount.getBalance());
    }
}

