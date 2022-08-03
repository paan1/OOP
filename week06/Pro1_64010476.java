import java.util.*;

public class Pro1_64010476{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter weight in pound: ");
        double weight = input.nextDouble();
        System.out.print("Enter feet : ");
        double feet = input.nextDouble();
        System.out.print("Enter inches : ");
        double inches = input.nextDouble();

        BMI person = new BMI(name , age , weight , feet , inches);
        System.out.printf("BMI: %.2f\n",person.getBMI());
        System.out.print("Status: "+person.getStatus());
}
}