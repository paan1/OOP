public class TestMethodOverloading{
    public static void main(String[]args) {
        int result1;
        if (3>4)result1=3;
        else result1=4;
        System.out.println("The maximum of 3 and 4 is "+result1);
        double result2;
        if (3.0>5.4)result2=3.0;
        else result2=5.4;
        System.out.println("The maximum of 3.0 and 5.4 is " +result2);
        double result3;
        if (3.0>5.4)
        {
        if (3.0>10.14)result3=3.0;
            else result3=10.14;
            else if (5.4>10.14)result3=5.4;
            else result3=10.14;
            System.out.println("The maximum of 3.0, 5.4, and 10.14 is " +result3);
        
        


    
public static int max(int num1, int num2)
{
    int result1;
    if (3>4)result1=3;
    else result1=4;
    System.out.println("The maximum of 3 and 4 is "+result1);
}
public static double max(double num1, double num2)
{
    double result2;
        if (3.0>5.4)result2=3.0;
        else result2=5.4;
        System.out.println("The maximum of 3.0 and 5.4 is " +result2);
}
public static double max(double num1, double num2, double num3) {
    double result3;
    if (3.0>5.4){
        if (3.0>10.14)
        result3=3.0;
        else result3=10.14;
        else if (5.4>10.14)
        result3=5.4;
        else result3=10.14;
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " +result3);}
 }