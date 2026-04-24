package exercises;
/*(Financial application: Calculate future investment value) 
Write a program that reads in investment amount, annual 
interest rate, and number of years and displays the future
investment value*/

//Importing the java scanner
import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args){
        //creates the scanner object
        Scanner sc = new Scanner(System.in);

        //Asks the user for the investment infor
        System.out.print("Enter investment amount: ");
        double investment = sc.nextDouble();
        System.out.print("Enter annual interest: ");
        double annualInterest = sc.nextDouble();
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();

        //calculate the monthlyinterestrate 
        double monthlyInterestRate = (annualInterest/100) /12;

        //Calculate the future investment based on the given formula
        double futureInvestment = investment * (Math.pow((1 + monthlyInterestRate),(years * 12)));
        /*Instead of using the usual way to round, I will need to trunucate the 
        the future investment so that I can get that exact value  
        To truncate, we are basically keep two decimal places, we move
        the decimal point, convert the number to a long or int, and
        then move the decimal back  
        
        the next following statements will explain the breakdown and process
        to trunucate on java*/


        //This moves the decimal point to the right two times
        futureInvestment *= 100;

        //This statement will convert the calculated investment into a int
        futureInvestment = (int) futureInvestment;
        double finalAnswer = futureInvestment / 100.0;
       
        System.out.println("Future value is $"+finalAnswer);
        
    }
}
