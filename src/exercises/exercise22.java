package exercises;

import java.util.Scanner;

/*(Financial application: monetary units)
Rewrite Listing 2.10, ComputeChange.java to fix the possible
loss of accuracy when converting a double value to an int
value. Enter the input as an integer whose last two digits
represent the cents. For  */
public class exercise22 {
    public static void main(String[] args){
        //Create a Scanner
        Scanner sc = new Scanner(System.in);

        //Recieve the amount
        System.out.print("Enter an amount in double, for example 1156: ");
        int amount = sc.nextInt();
 
        double doubleAmount = amount/ (double) 100.0;

        int dollars = (int) doubleAmount;
        doubleAmount -= dollars;
        doubleAmount *= 100;
        int remainingCents = (int) doubleAmount;
        
        int quarters = remainingCents / 25;
        remainingCents -= (quarters * 25);
        int dimes = remainingCents / 10;
        remainingCents -= (dimes * 10);
        int nickels = remainingCents / 5;
        remainingCents -= (nickels * 5);
        int pennies = remainingCents;


        // remainingCents -= (quarters * 50);
        // int dimes = remainingCents - (quarters * 50);
        // remainingCents -= (dimes * 10);
        // int nickels = remainingCents / 5; 
        // remainingCents -= (nickels * 5);
        // int pennies = remainingCents;
        System.out.println("Dollars: "+dollars);
        System.out.println("Quarters: "+quarters);
        System.out.println("Dimes: "+dimes);
        System.out.println("Nickels: "+nickels);
        System.out.println("Pennies: "+pennies);


    }
}
