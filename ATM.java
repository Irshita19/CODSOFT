package CodSoft.Task3;
import java.util.Scanner;
public class ATM
{
	private BankAccount acc;
    public ATM(BankAccount acc) 
    {
		super();
		this.acc = acc;
	}
    Scanner sc = new Scanner(System.in);
    
    private void checkBalance() 
    {
    	double balance = acc.getBalance();
    	System.out.println("Current Balance: Rupees "+balance);
    }

    private void deposit() 
    {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        acc.deposit(amount);
    }

    private void withdraw() 
    {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        acc.withdraw(amount);
    }
    public void display() 
    {
        int ch;
        System.out.println("Enter 1 to Check Balance.");
        System.out.println("Enter 2 to Deposit Money.");
        System.out.println("Enter 3 to Withdraw Money.");
        System.out.println("Enter 4 to Exit.");
        System.out.print("Enter your choice: ");
        ch = sc.nextInt();
        
        while (true)
        {
            switch (ch) 
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank You for using ATM!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(27000.0);
        ATM atm = new ATM(account);
        atm.display();
    }
}
