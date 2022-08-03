import java.util.*;

public class Pro4_64010476 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Filing Status");
        System.out.println("\t[0]-Single filer");
        System.out.println("\t[1]-Married jointly or qualifying widow(er)");
        System.out.println("\t[2]-Married separately");
        System.out.println("\t[3]-Head of household");
        System.out.print("Enter the filing status: ");
        int status = input.nextInt();
    
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();
    
        double[] rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        int[][] brackets = { { 8350, 33950, 82250, 171550, 372950 },
            { 16700, 67900, 137050, 20885, 372950 },
            { 8350, 33950, 68525, 104425, 186475 },
            { 11950, 45500, 117450, 190200, 372950 }
        };
    
        double tax = 0;
        double upperBound,lowerBound;
        int n = 5;
        
        for(int i = 0; i <5;i++){
            if(income <= brackets[status][i]){
                n=i;
                break;
            }
        }
        for(int i = 0; i <=n;i++){
            upperBound = (i==5 || n==i)?income:brackets[status][i];
            lowerBound = (i==0)?0:brackets[status][i-1];
            tax += (upperBound-lowerBound)*rates[i];
        }
        System.out.printf("Tax is %.2f", tax);
    }
    

      }

