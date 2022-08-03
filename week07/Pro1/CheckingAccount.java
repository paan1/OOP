public class CheckingAccount extends Account {
    private double overdraftLimit = 0;
    
    public CheckingAccount(){
        super();
    }

    public CheckingAccount(int id , double balance){
        super(id, balance);
    }

    public CheckingAccount(int id , double balance, double overdraftLimit){
        super(id,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= 0)System.out.println("Error");
        else if (balance + overdraftLimit >= amount ) {
            balance -= amount;
        }
        else{
            System.out.println("Error");
        }
    }
}
