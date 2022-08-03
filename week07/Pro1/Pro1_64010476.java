public class Pro1_64010476 {
    public static void main(String[] args) {
        CheckingAccount checking = new CheckingAccount(0,5000,5000);
        System.out.println("Checking Account");
        System.out.println("Overdraft Limit: "+checking.getOverdraftLimit());
        System.out.println("Balance is "+checking.getBalance());
        System.out.println("Withdraw: 10000.00");
        checking.withdraw(10000.1);
        System.out.println("Balance is "+checking.getBalance());
        System.out.println("This account was created at "+checking.getDateCreated());
	}
}
