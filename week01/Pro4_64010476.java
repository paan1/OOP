import java.util.Scanner;

public class Pro4_64010476 {
      public static void main(String[]args) 
      { 
       Scanner sc = new Scanner(System.in); 
      { 
       System.out.print("Input your weight : ");  
       double weight = sc.nextDouble(); 
       System.out.print("Input your height : ");  
       double height = sc.nextDouble();
       double w =  weight * 0.45359237 ;
       double h =  height * 0.0254 ;               
       double bmi = w / (h * h);        
       System.out.printf("BMI is :%.4f",bmi); 
      }
      } 
}