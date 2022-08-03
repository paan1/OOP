public class Pro1_64010476 {
    public static void main(String[] args) {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("\nBalance: "+account.getBalance());
        System.out.println("Monthly interest: "+account.getMonthlyInterest());
        System.out.println("this account was created: "+account.getDateCreated());
    }
}

