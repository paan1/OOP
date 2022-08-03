import java.util.*;

class Account{
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account(){
        dateCreated = new Date();
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }


    public double getMonthlyInterestRate(){
        return (annualInterestRate / 12); 
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() /100;
    }

    public void withdraw(double amount){ 
       if(amount <= balance && amount > 0)
       { 
           balance -= amount;
       }
       
    }

    public void deposit(double amount){
        if(amount > 0){
         balance += amount;
        }
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        if(id >=0 ){this.id = id;}
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        
        if(balance >= 0 ){this.balance = balance;}
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate){
        if(newAnnualInterestRate >= 0){annualInterestRate = newAnnualInterestRate;}
    }

    public Date getDateCreated(){
        return dateCreated;
    }

}