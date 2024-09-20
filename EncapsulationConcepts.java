package main;

class BankAccount
{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance)
    {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;

    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double deposit_amount)
    {
        if( deposit_amount > 0)
        balance = balance + deposit_amount;
    }

    public void withdraw(double withdraw_amount)
    {
        if(withdraw_amount > 0 && withdraw_amount < balance)
        {
            balance = balance - withdraw_amount;
        }
        else if(withdraw_amount > 0 && withdraw_amount > balance)
        {
            System.out.println("Withdraw amount is very big. Not avalaible in bank");
        }

    }
}

public class EncapsulationConcepts {

    public static void main(String[] args) {
        
        BankAccount obj = new BankAccount("AC123", 50000.00);
        
        obj.deposit(50000);
        obj.withdraw(20000);
        System.out.println("Account Number: "+ obj.getAccountNumber());
        System.out.println("Account Balance: " + obj.getBalance());
    }
    
}
