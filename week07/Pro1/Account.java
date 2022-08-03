import java.util.*;

class Account{
    private int id = 0;
    protected double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.dateCreated = new Date();
        setId(id);
        setBalance(balance);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        if(id >=0 )this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        if(balance >=0)this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate()/100;
    }

    public void withdraw(double amount) {
        if(amount > 0)this.balance -= amount;
    }

    public void deposit(double amount) {
        if(amount > 0)this.balance += amount;
        
    }
    public String toString() {
        return "This account was created at "+getDateCreated();
    }
}