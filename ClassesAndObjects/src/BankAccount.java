
public class BankAccount {
    private final String accountNumber;
    private final String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance = 0.0;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        this.balance = balance +amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            this.balance=balance-amount;
        }
    }

    public void showAccountDetails(){
        System.out.println("Account Number "+ accountNumber);
        System.out.println("Owner Name "+ ownerName);
        System.out.println("Balance "+ balance);
    }
}
