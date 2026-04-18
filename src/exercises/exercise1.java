package exercises;



/* (Convert mile to kilometer) Write a program that reads a mile in a double value from the console, converts it to kilometers, 
and displays the result. The formula for the conversion is as follows: 
    1 mile = 1.6 kilometers */
    
import java.util.Scanner;

    public class exercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = sc.nextDouble();

        double result = miles * 1.6;
        System.out.println(miles + " miles is " + ((int)(result * 100) / 100.0)+ " kilometers");

    }
}
