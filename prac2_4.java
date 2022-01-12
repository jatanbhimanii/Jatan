import java.util.Date;
class Account3 {
    protected String id;
    protected double balance = 500;
    protected double annualInterestRate = 7;
    protected final Date dateCreated;
    
    Account3(){
        dateCreated = new Date();
    }
    Account3(String id, double initialBalance){
        this.id = id;
        this.balance = initialBalance;
        dateCreated = new Date();
    }
    public String getId()
    {
        return id;
    }
    public void setId(String id) 
    {
        this.id = id;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance) 
    {
        this.balance = balance;
    }
    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated() 
    {
        return dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12.0;
    }
    public double getMonthlyInterest()
    {
        return (balance * getMonthlyInterestRate() * 30) / 100.0;
    }
    public void withdraw(int amount)
    {
        balance -= amount;
        System.out.println("Amount: " + amount + " withdrawn, current balance: " + balance);
    }
    public void deposit(int amount)
    {
        balance += amount;
        System.out.println("Amount: " + amount + " deposited, current balance: " + balance);
    }
}
class CheckingAccount extends Account3 
{
    int overdraftLimit = 10000;
    @Override
    public void withdraw(int amount)
    {
        if(amount > overdraftLimit)
        {
            System.out.println("Can't withdraw: " + amount + ", overdraft limit is: " + overdraftLimit);
            return;
        }
        balance -= amount;
        System.out.println("Amount: " + amount + " deposited, current balance: " + balance);
    }
    public int getOverdraftLimit() 
    {
        return overdraftLimit;
    }
    public void setOverdraftLimit(int overdraftLimit) 
    {
        this.overdraftLimit = overdraftLimit;
    }
}
class SavingsAccount extends Account3 {
    int overdrawnLimit = 0;
    
    public void withdraw(int amount)
    {
        if(balance - amount < overdrawnLimit)
        {
            System.out.println("Can't withdraw: " + amount + ", overdrawn limit is: " + overdrawnLimit);
            return;
        }
        balance -= amount;
        System.out.println("Amount: " + amount + " deposited, current balance: " + balance);
    }

    public int getOverdrawnLimit() 
    {
        return overdrawnLimit;
    }

    public void setOverdrawnLimit(int overdrawnLimit) 
    {
        this.overdrawnLimit = overdrawnLimit;
    }
}
public class prac2_4 
{
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount();
        CheckingAccount ca = new CheckingAccount();
        System.out.println("<SavingsAccount>.toString() = " + sa.toString());
        System.out.println("<CheckingAccount>.toString() = " + ca.toString());
        sa.withdraw(500);
        ca.withdraw(300);
    }
}