import java.util.Scanner;
public class test {
    public static void main(String[] args)
    {
        
        System.out.println("please input number");
        Scanner inputNum;
        inputNum = new Scanner(System.in);
        long num = inputNum.nextLong();
        long sum=0;
        if (num <- 0 || num > 1000)
        {
            System.out.println("lnvalid");
        }
        else
        {
            sum += (num % 10);
            num = num / 10;
            sum += (num % 10);
            num = num / 10;
            sum += (num % 10);
            System.out.println("The sum of the digits is " + sum);
        }
        
        inputNum.close();
    }
}
