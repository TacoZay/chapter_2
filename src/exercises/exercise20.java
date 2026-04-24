package exercises;
/*(Financial Application: calculate interest)
If you know the balance and the annual percentage interest rate
you can compute the interest on the next monthly payment 
using the following formula:
interest = balance * (annualInterestRate/1200) 

Write a program that reads the balance and the annual percentage
interest rate and displays the interest for the next month. Here
is a sample run:

Enter balance and interest rate (e.g., 3 for 3%): 1000 3.5
The interest is 2.91667*/

//Import the java scanner
import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args){
        //create the scanner object
        Scanner sc = new Scanner(System.in);

        //User enters in the balance and their interest rate
        double balance, annualInterest;
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance = sc.nextDouble();
        annualInterest = sc.nextDouble();

        double scale = Math.pow(10,5);
        //Calculate the interest for next month and round to 5 decimal spots
        double interest = Math.round(balance * (annualInterest/1200) *scale)  /scale;
        System.out.println("The interest is " + interest);


    }
}
