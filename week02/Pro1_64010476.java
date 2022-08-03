import java.util.Scanner;

public class Pro1_64010476 {
    public static void main(String[] args) {
        String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int toDay = 0, nextDay = 0, futureDay = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        toDay = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        nextDay = input.nextInt();
        futureDay = (toDay + nextDay) % 7;
        if(nextDay < 1){System.out.print("invalid number");}
        else if(toDay < 0 && toDay > 6){System.out.print("invalid number");}
        else{System.out.printf("Today is %s and the future day is %s", week[toDay], week[futureDay]);}
    }
}