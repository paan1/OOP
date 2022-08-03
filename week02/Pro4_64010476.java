import java.util.Scanner;
import java.util.Arrays;

public class Pro4_64010476 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] cities = new String[3];
        System.out.print("Enter the first city: ");
        cities[0] = input.nextLine();
        System.out.print("Enter the second city: ");
        cities[1] = input.nextLine();
        System.out.print("Enter the third city: ");
        cities[2] = input.nextLine();
        Arrays.sort(cities);
        System.out.print("The three cities in alphabetical order are");
        for (int i = 0; i < 3; i++)
        {
            System.out.print(" " + cities[i]);
        }
        
    }
    
}
