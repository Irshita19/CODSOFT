package CodSoft.Task3;
public class BankAccount 
{
    private double balance;
    public BankAccount(double balance) 
    {
		super();
		this.balance = balance;
	}
	public double getBalance() 
    {
		return balance;
    }
    public void deposit(double amount) 
    {
    	if (amount > 0) 
        {
            balance = balance + amount;
            System.out.println("Amount deposited: Rupees " +amount+
            		". New balance: Rupees " +balance);
        } 
        else 
        {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance = balance - amount;
            System.out.println("Amount withdrawn: Rupees " +amount+ ". New balance: Rupees " +balance);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient Balance. Withdrawal amount exceeds balance amount.");
        } 
        else 
        {
            System.out.println("Invalid amount. Withdrawal amount must be greater than zero.");
        }
    }
}
