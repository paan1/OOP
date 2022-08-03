import java.util.*;

public class pro6_64010476 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account(i, 100);
        }
        int id;
        while (true) {

            while (true) {
                System.out.print("Enter an id: ");
                id = input.nextInt();
                if (id >= 0 && id < 10) {
                    break;
                }
            }
            while (true) {
                System.out.println("Main menu\n1: check balance\n2: withdraw\n3: deposit\n4: exit");
                System.out.print("Enter a choice: ");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("The balance is " + accounts[id].getBalance());
                        break;
                    case 2:
                        System.out.print("Enter an amount to withdraw: ");
                        accounts[id].withdraw(input.nextDouble());
                        break;
                    case 3:
                        System.out.print("Enter an amount to deposit: ");
                        accounts[id].deposit(input.nextDouble());
                        break;
                    case 4:
                        System.out.println("End of Program.");
                        break;
                    default:
                        break;
                }
                if (choice == 4) {
                    break;
                }
            }
        }

        
    }
}
