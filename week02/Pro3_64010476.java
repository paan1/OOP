import java.util.Scanner;

public class Pro3_64010476 
{
          public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter year: ");
            int year = input.nextInt();
    
            System.out.print("Enter month 1-12: ");
            int m = input.nextInt();
    
            System.out.print("Enter day 1-31: ");
            int q = input.nextInt(); // q is the day of the month.
            String[] day_of_week = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
            if(year <= 0 )
            {
                System.out.println("invalid year");
            }
            if(m <= 0 || m > 12)
            {
                System.out.println("invalid month");
            }
            else if ((year % 4 == 0 && year % 100 != 0) || year % 400==0) {
                int[] monthYearLeap = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                if (q > monthYearLeap[m - 1]) {
                    System.out.println("Day is invalid("+ monthYearLeap[m - 1] + ")");
                }
            
            } else{
                int[] monthYear = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                if (q > monthYear[m - 1]) {
                    System.out.println("Day is invalid("+ monthYear[m - 1] + ")");
                }
                
            if (m == 1 || m == 2) 
            {
                m += 12;
                year--;
            }
            int j = year / 100;
            int k = year % 100;
            int h = (q+((26*(m+1))/10)+k+(k/4)+(j/4)+(5*j))%7;
    
            System.out.println(day_of_week[h]);
        }
          }
}