import java.util.Arrays;

public class Pro3_64010476{

    public static void main(String[] args) {
        System.out.println("Creating a list containing 1000 elements,");
        double[] arr = new double[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 1000;
        }
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%10.2f", arr[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("List created.");
        System.out.println("Sorting stopwatch starts...");
        Stopwatch stopWatch = new Stopwatch();
        Arrays.sort(arr);
        stopWatch.stop();
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%10.2f", arr[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("Sorting stopwatch stoped.");
        System.out.printf("The sort time is %.1f milliseconds.\n", stopWatch.getElapsedTime());
        System.out.println("------------------------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");

        stopWatch.start();
        int count = 0;
        for (int i = 0; count < 100; i++) {
            if (isPalindrome(i) && isPrime(i)) {
                count++;
                System.out.print(i);
                if (count % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.print(" ");
                }
            }
        }
        stopWatch.stop();
        System.out.println("PalindromePrime created.");
        System.out.println("The palindromPrime stopwatch stoped.");

        System.out.printf("The palindromPrime time is %.1f milliseconds.",stopWatch.getElapsedTime());
    }
    static boolean isPrime(int i) {
        if(i <= 1) return false;
        for(int j = 2;j < i;j++)
        {
            if(i % j == 0) return false;
        }
        return true;
    }
    static boolean isPalindrome(int n) {
        int a = n;
        int number = 0;
        while (n > 0) {
            number *= 10;
            number += n % 10;
            n /= 10;
        }
        return (a == number);
    }
}
