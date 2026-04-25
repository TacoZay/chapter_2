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
        System.out.print("Enter an amount in double, for example 11.56: ");
        int amount = sc.nextInt();

        int dollars = amount / 100;
        // amount -= dollars;
        // amount *= 100;

        

        System.out.println(dollars);
        System.out.println(amount);


    }
}
